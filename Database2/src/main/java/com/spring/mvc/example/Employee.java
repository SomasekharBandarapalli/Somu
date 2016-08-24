package com.spring.mvc.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Employee 
{
	@RequestMapping("/welcome")
	public String name()
	{
		System.out.println("welcome controller");
		return "welcome";		
	}
}