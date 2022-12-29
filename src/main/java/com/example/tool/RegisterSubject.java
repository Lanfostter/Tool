package com.example.tool;


import org.apache.poi.ss.formula.functions.T;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.example.tool.edudto.StudentCourseRegisterViewDto;
import com.example.tool.edudto.StudentCourseSubjectDto;
import com.example.tool.edudto.StudentDto;





public class RegisterSubject {
	private static String HostPath = "http://localhost:8081/education/api/cs_reg_mongo/findByPeriod/";
	private static String HostPath1 = "http://localhost:8081/education/api/cs_reg_mongo/add-register/";

	public StudentCourseRegisterViewDto testRegisterSubject(String accessToken, String tokenType) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", tokenType + " " + accessToken);
		headers.add("Content-Type", "application/x-www-form-urlencoded");
		String url = HostPath + "568/18";
		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);
		HttpEntity<T> entity = new HttpEntity<T>((T) null, headers);
		ResponseEntity<StudentCourseRegisterViewDto> response = restTemplate.exchange(url, HttpMethod.GET, entity,StudentCourseRegisterViewDto.class);
		return response.getBody();
	}
	public StudentCourseSubjectDto addRegister(String accessToken, String tokenType, String json) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", tokenType + " " + accessToken);
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Content-Type", "application/x-www-form-urlencoded");
		String url = HostPath1 + "568/18";
		  HttpEntity<String> request = 
			      new HttpEntity<String>(json, headers);
		ResponseEntity<StudentCourseSubjectDto> response = restTemplate.postForEntity(url, request, StudentCourseSubjectDto.class);
		System.out.println(response.getBody().getStatus());
		return response.getBody();	
	}
}
