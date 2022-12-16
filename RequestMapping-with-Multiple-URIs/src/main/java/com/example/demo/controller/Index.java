package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class Index {
	@RequestMapping(value = {"", "/page", "page*","view/*,**/msg"})
	public String getIndex() {
		return "getIndex()";
	}
	

}
