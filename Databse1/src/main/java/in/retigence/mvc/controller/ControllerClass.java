package in.retigence.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {
	@RequestMapping("/name")
public String name() {
	System.out.println("hello java");
	return "welcome";
}
	@RequestMapping("/value")
	public String value() {
		System.out.println("Hello World");
		return "index";
	}
}
