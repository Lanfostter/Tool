package com.example.tool;

import java.util.Base64;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.example.tool.dto.LoginExtDto;
import com.example.tool.dto.TokenExtDto;
import com.globits.education.utils.RestApiUtils;

public class Login {
	public static String host = "localhost";
	public static String port = "8081";
	public static String api = "/education/oauth/token";
	public static String access_token = "";
	public static String token_type = "";
	public static String url = host + ":" + port + api;

	public static ResponseEntity<String> postLogin(String username, String password, String url) {
		try {
//			if(RestApiUtils.host==null|| RestApiUtils.host.length()<=0) {
//				RestApiUtils.getConfig();
//			}
			String authStr = "education_client:password";
			String base64Creds = Base64.getEncoder().encodeToString(authStr.getBytes());
			HttpHeaders headersLogin = new HttpHeaders();
//			headersLogin.add("Authorization", "Basic ZWR1Y2F0aW9uX2NsaWVudDpwYXNzd29yZA==");
			headersLogin.add("Authorization", "Basic " + base64Creds);
			headersLogin.add("Content-Type", "application/x-www-form-urlencoded");
			// headersLogin.add("Accept-Charset", "UTF-8");
			MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
			map.add("client_id", "education_client");
			map.add("grant_type", "password");
			map.add("username", username);
			map.add("password", password);
			map.add("client_secret", "password");
			HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headersLogin);
//			String body="client_id=education_client&grant_type=password&username=tuyenlt&password=Globits@123&client_secret=password";
//			HttpEntity<String> request = new HttpEntity<String>(body, headersLogin);
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<String> responseLogin = null;
			try {
				responseLogin = restTemplate.exchange(url, HttpMethod.POST, request, String.class);
//				System.out.println(responseLogin.getBody());

				if (responseLogin.getBody() != null && responseLogin.getBody().length() > 0) {
					if (responseLogin.getBody().contains(",")) {
						String[] output = responseLogin.getBody().split(",");
						if (output != null && output.length > 0) {
							for (int i = 0; i < output.length; i++) {
								if (output[i] != null && output[i].contains(":")) {
									String[] acc = output[i].split(":");
									if (acc != null && acc.length > 0) {
										for (int j = 0; j < acc.length; j++) {
											if (acc[j].contains("access_token")) {
												access_token = acc[j + 1];
												access_token = access_token.replace('"', ' ');
												access_token = access_token.replace('"', ' ');
											}
											if (acc[j].contains("token_type")) {
												token_type = acc[j + 1];
												token_type = token_type.replace('"', ' ');
												token_type = token_type.replace('"', ' ');
											}
										}
									}
								}
							}
						}
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			return responseLogin;

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public static <T> ResponseEntity<T> post(String username, String password, String urlLogin, String url,
			Object parameterObject, Class<T> returnType) {
//		try {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		postLogin(username, password, urlLogin);
		headers.add("Authorization", com.example.tool.Login.token_type + " " + Login.access_token);
		HttpEntity<T> entity = new HttpEntity<T>((T) parameterObject, headers);
		ResponseEntity<T> response = restTemplate.exchange(url, HttpMethod.POST, entity, returnType);
		ResponseEntity<T> page = response;
		return page;
//		} catch (Exception e) {
//			e.getMessage();
////			ResponseEntity<T> page = new ResponseEntity<T>(e.getMessage());
//			e.printStackTrace();
//			return null;
//		}
	}
	public static TokenExtDto getToken(LoginExtDto dto) {
		System.out.println("Login for user:" + dto.getUsername());
		ResponseEntity<String> responseLogin = RestApiUtils.postLogin(dto.getUsername(), dto.getPassword(),
				dto.getUrl());
		TokenExtDto ret = new TokenExtDto();
		String access_token = "";
		String token_type = "";
		String refresh_token = "";
		String expires_in = "";
		String scope = "";
		if (responseLogin != null && responseLogin.getBody() != null && responseLogin.getBody().length() > 0) {
			if (responseLogin.getBody().contains(",")) {
				String[] output = responseLogin.getBody().split(",");
				if (output != null && output.length > 0) {
					for (int i = 0; i < output.length; i++) {
						if (output[i] != null && output[i].contains(":")) {
							String[] acc = output[i].split(":");
							if (acc != null && acc.length > 0) {
								for (int j = 0; j < acc.length; j++) {
									if (acc[j].contains("access_token")) {
										access_token = acc[j + 1];
										access_token = access_token.replace('"', ' ');
										access_token = access_token.replace('"', ' ');
									}
									if (acc[j].contains("token_type")) {
										token_type = acc[j + 1];
										token_type = token_type.replace('"', ' ');
										token_type = token_type.replace('"', ' ');
									}
									if (acc[j].contains("refresh_token")) {
										refresh_token = acc[j + 1];
										refresh_token = refresh_token.replace('"', ' ');
										refresh_token = refresh_token.replace('"', ' ');
									}
									if (acc[j].contains("expires_in")) {
										expires_in = acc[j + 1];
										expires_in = expires_in.replace('"', ' ');
										expires_in = expires_in.replace('"', ' ');
									}
								}
							}
						}
					}
				}
			}
		} else {
			System.out.println("Login fail for user:" + dto.getUsername() + ":" + dto.getPassword());
		}
		ret.setAccess_token(access_token.trim());
		ret.setExpires_in(expires_in.trim());
		ret.setRefresh_token(refresh_token.trim());
		ret.setScope(scope.trim());
		ret.setToken_type(token_type.trim());
		return ret;
	}
}
