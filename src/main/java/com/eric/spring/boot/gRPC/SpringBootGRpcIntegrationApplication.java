package com.eric.spring.boot.gRPC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author Shahnawaz
 *
 */
@SpringBootApplication(scanBasePackages = {"com.eric.spring.boot.configuration.gRPC"})
public class SpringBootGRpcIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGRpcIntegrationApplication.class, args);
	}

}
