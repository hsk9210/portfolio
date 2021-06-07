package com.hsk9210.controller;

import java.net.URI;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


public class RestTemplateEx {
	public static void main(String[] args) {
		int timeout1 = 5000; //읽기 시간 초과
		int timeout2 = 3000; //연결 시간 초과
		int maxConnTotal = 100; //connection pool 최대 연결수
		int maxConnPerRoute = 5; //루트당 최대 연결수
		
		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		
		
		requestFactory.setReadTimeout(timeout1);
		requestFactory.setConnectTimeout(timeout2);
		
		HttpClient httpClient = HttpClientBuilder.create()
				.setMaxConnTotal(maxConnTotal).setMaxConnPerRoute(maxConnPerRoute)
				.build();
		//동기실행에 사용될 HttpClient 인터페이스 구현된 변수 삽입
		requestFactory.setHttpClient(httpClient);
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		
		String uri = "http://localhost:8080/";
		String path = "search?text=1234";
		URI uriToUrl = UriComponentsBuilder
				.fromUriString(uri)
				.path(path)
				.encode()
				.build()
				.toUri();
		

		Object responseType = "응답내용과 자동으로 매핑시킬 java Object class를 넣어야 합니다. 제네릭은 예시고.";
		Object obj = restTemplate.getForObject(uriToUrl, (Class<SampleController>) responseType);
		
		
		
	}

}
