package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class DemoController {
	
	@RequestMapping("/")
	public String getUser() {
		return "Returned All Users";
	}
	
	// we have specified multiple paths with comma separated
	@RequestMapping(value = {"/seconduser", "/second-user", "/SecondUser"}, method = RequestMethod.GET)
	public String getSecondUser() {
		return "Returnd Second User";
	}
	
	// http://localhost:8080/users/seconduser
	// http://localhost:8080/users/second-user
	// http://localhost:8080/users/SecondUser

	// Above end points support 'getSecondUser' method similorly we
	// we provide multiple paths by using 'value'
	

}
