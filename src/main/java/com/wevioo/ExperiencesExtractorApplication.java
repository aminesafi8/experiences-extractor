package com.wevioo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ExperiencesExtractorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExperiencesExtractorApplication.class, args);
	}

}
