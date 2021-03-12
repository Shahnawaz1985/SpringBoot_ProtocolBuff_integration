package com.eric.spring.boot.configuration.gRPC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.eric.spring.boot.controllers.gRPC", "com.eric.spring.boot.abstract_svc.gRPC", "com.eric.spring.boot.service.gRPC"})
public class ApplicationConfiguration {
	
	
	@Bean
	public ObjectMapper objectMapper() {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setVisibility(objectMapper.getVisibilityChecker()
		             .withFieldVisibility(JsonAutoDetect.Visibility.ANY));
		return objectMapper;
	}
	
	
	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}

}
