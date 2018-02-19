package com.example.versions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableFeignClients
@EnableAsync
public class VersionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(VersionsApplication.class, args);
	}

}
