package com.example.demo.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/billing")
public class BillingService {
	
	@Value("name")   //value comes from the application.props file or yml file
	String strMessage;
	@GetMapping
	public String welcome()
	{
		return "Bill generated"+strMessage;
	}
	
	@GetMapping("/status")
	public String status()
	{
		return "Up and running>>bill";
	}
	
	

}
