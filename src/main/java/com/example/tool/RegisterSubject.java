package com.example.tool;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.T;
import org.bson.json.JsonObject;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.example.tool.dto.RestResponsePage;
import com.example.tool.edudto.StudentCourseRegisterViewDto;
import com.example.tool.edudto.StudentCourseSubjectDto;
import com.example.tool.edudto.StudentDto;

public class RegisterSubject {
	private static String HostPath = "http://localhost:8081/education/api/cs_reg_mongo/findByPeriod/";
	private static String HostPath1 = "http://localhost:8081/education/api/cs_reg_mongo/add-register/";

	public StudentCourseRegisterViewDto testRegisterSubject(String accessToken, String tokenType, String stuId) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", tokenType + " " + accessToken);
		headers.add("Content-Type", "application/x-www-form-urlencoded");
		String url = HostPath +stuId+"/18";
		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);
		HttpEntity<T> entity = new HttpEntity<T>((T) null, headers);
		ResponseEntity<StudentCourseRegisterViewDto> response = restTemplate.exchange(url, HttpMethod.GET, entity,
				StudentCourseRegisterViewDto.class);
		return response.getBody();
	}

	public StudentCourseSubjectDto addRegister(String accessToken, String tokenType, String json, String stuId) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", tokenType + " " + accessToken);
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Content-Type", "application/x-www-form-urlencoded");
		String url = HostPath1 +stuId+"/18";
		HttpEntity<String> request = new HttpEntity<String>(json, headers);
		ResponseEntity<StudentCourseSubjectDto> response = restTemplate.postForEntity(url, request,
				StudentCourseSubjectDto.class);
		return response.getBody();
	}

	public String findStudentByStudentCode(String studentCode, String accessToken, String tokenType) throws ParseException, JsonGenerationException, JsonMappingException, IOException, NoSuchFieldException, SecurityException {
		String url = "http://localhost:8081/education/api/student/studentCodeDto/" + studentCode + "/1/100";
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", tokenType + " " + accessToken);
		headers.add("Content-Type", "application/x-www-form-urlencoded");
		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);
		HttpEntity<T> entity = new HttpEntity<T>((T) null, headers);
		ParameterizedTypeReference<RestResponsePage<Object>> responseType = new ParameterizedTypeReference<RestResponsePage<Object>>() {
		};
		ResponseEntity<JSONObject> response = restTemplate.exchange(url, HttpMethod.GET, entity, JSONObject.class);
		ArrayList<Object> arrayList = (ArrayList<Object>) response.getBody().get("content");
		String id= null;
		for(Object object : arrayList) {
			ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
			String json = ow.writeValueAsString(object);
			JSONParser parser = new JSONParser();
			JSONObject jsonObject = (JSONObject) parser.parse(json);
			System.out.println(jsonObject.get("id"));
			id =  String.valueOf(jsonObject.get("id"));
		}
		return id;
	}
}
