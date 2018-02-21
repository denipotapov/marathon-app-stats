package com.example.versions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;
import org.thymeleaf.util.StringUtils;

@Import(FeignClientsConfiguration.class)
@SpringBootApplication
@EnableFeignClients
@EnableAsync
public class VersionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(VersionsApplication.class, args);
	}

}
