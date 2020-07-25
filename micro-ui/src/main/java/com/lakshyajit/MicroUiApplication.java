package com.lakshyajit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableEurekaClient
@RequestMapping("/")
public class MicroUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroUiApplication.class, args);
	}

}