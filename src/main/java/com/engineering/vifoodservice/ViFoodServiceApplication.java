package com.engineering.vifoodservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ViFoodServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViFoodServiceApplication.class, args);
	}

}
