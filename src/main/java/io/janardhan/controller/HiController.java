package io.janardhan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class HiController {
 
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello";
		
	}
	@RequestMapping("/hello1")
	public String getDetails() {
		return "Spring Boot starting example";
	}


}
