package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class Feignproject1Application {

	public static void main(String[] args) {
		SpringApplication.run(Feignproject1Application.class, args);
	}

}
