package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class DemoController {
	@RequestMapping("/hello")
	public String helloWorld() {
		return "Hello";
	}
	
	@RequestMapping("/java")
	public String java() {
		return "Java";
	}
	

}
