package com.example.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/server")
public class HelloService {
	
	@Autowired
	Environment environment; //is a reference to properties file
	
	@GetMapping
	public String welcome()
	{
		String port = environment.getProperty("server.port");
		return "Programming Microservices@"+port;
	}
	
	@GetMapping("/status")
	public String status()
	{
		return "Up and running>>";
	}
	
	
	

}
