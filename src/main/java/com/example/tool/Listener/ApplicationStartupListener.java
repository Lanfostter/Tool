package com.example.tool.Listener;

import static org.junit.Assert.assertNotNull;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.imageio.spi.RegisterableService;

import org.bson.json.JsonObject;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.weaving.DefaultContextLoadTimeWeaver;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.example.tool.Const;
import com.example.tool.Login;
import com.example.tool.RegisterSubject;
import com.example.tool.dto.UserDto;
import com.example.tool.edudto.CourseRegisterViewDto;
import com.example.tool.edudto.CourseSubjectDto;
import com.example.tool.edudto.LoginExtDto;
import com.example.tool.edudto.StudentCourseRegisterViewDto;
import com.example.tool.edudto.StudentCourseSubjectDto;
import com.example.tool.edudto.StudentDto;
import com.example.tool.edudto.SubjectRegistrationDto;
import com.example.tool.edudto.TimeTableDto;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

@Component
public class ApplicationStartupListener implements ApplicationListener<ContextRefreshedEvent>, InitializingBean {
	private static final Logger logger = LoggerFactory.getLogger(ApplicationStartupListener.class);
	@Autowired
	private Environment env;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Login login = new Login();
		List<UserDto> dtos = list("list_student.json");
		Const.URL_STRING = env.getProperty("url");
		Const.SEMESTER_STRING = env.getProperty("semester");
		for (UserDto dto : dtos) {
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println(dto.getUsername());
					LoginExtDto loginExtDto = new LoginExtDto();
					loginExtDto.setUsername(dto.getUsername());
					loginExtDto.setPassword(dto.getPassword());
					ObjectWriter mapper1 = new ObjectMapper().writer().withDefaultPrettyPrinter();
					String jsonString1 = null;
					try {
						jsonString1 = mapper1.writeValueAsString(loginExtDto);
					} catch (JsonGenerationException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					} catch (JsonMappingException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					login.postLogin(dto.getUsername(), dto.getPassword(), "http://" + login.url, jsonString1);
					System.out.println(login.token_type + " " + login.access_token);
					RegisterSubject subject = new RegisterSubject();
					String id = subject.findStudentByStudentCode(login.access_token, login.token_type);
					StudentCourseRegisterViewDto studentCourseRegisterViewDto = subject
							.testRegisterSubject(login.access_token, login.token_type, id);
					CourseRegisterViewDto courseRegisterViewDto = studentCourseRegisterViewDto
							.getCourseRegisterViewObject();
					for (SubjectRegistrationDto registrationDto : courseRegisterViewDto
							.getListSubjectRegistrationDtos()) {
//						StudentCourseSubjectDto courseSubjectDto = subject.addRegister(login.token_type, login.access_token);
						for (CourseSubjectDto courseSubjectDto : registrationDto.getCourseSubjectDtos()) {
							for (TimeTableDto timeTableDto : courseSubjectDto.getTimetables()) {
								courseSubjectDto.setTimetables(new ArrayList<>());
								courseSubjectDto.getTimetables().add(timeTableDto);
								ObjectWriter mapper = new ObjectMapper().writer().withDefaultPrettyPrinter();
								try {
									String jsonString = mapper.writeValueAsString(courseSubjectDto);
									System.out.println(courseSubjectDto.getDisplayName());
									StudentCourseSubjectDto scsDto = subject.addRegister(login.access_token,
											login.token_type, jsonString, id);
									if (scsDto != null) {
										break;
									}
								} catch (JsonGenerationException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (JsonMappingException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}

					}
				}

			});
			System.out.println(thread.getName() + " start");
			thread.start();
		}

	}

	public List<UserDto> list(String fileJson) {
		Object object;
		JSONParser jsonParser = new JSONParser();
		List<UserDto> dtos = new ArrayList<>();
		try {
			URL url = getClass().getClassLoader().getResource(fileJson);
			FileReader fileReader = new FileReader(url.getPath());
			object = jsonParser.parse(fileReader);
			JSONArray jsonStus = (JSONArray) object;
			for (Object jsonObj : jsonStus) {
				UserDto dto = new UserDto();
				JSONObject jsonObject = (JSONObject) jsonObj;
				dto.setUsername((String) jsonObject.get("username"));
				dto.setPassword((String) jsonObject.get("password"));
				dtos.add(dto);
			}
			System.out.println(jsonStus);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dtos;

	}

	@Override
	public void afterPropertiesSet() throws Exception {
	}

}
