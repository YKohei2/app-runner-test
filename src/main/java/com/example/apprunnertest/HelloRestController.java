package com.example.apprunnertest;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/users")
	public List<String> users() {
		return List.of("yamashita", "yamada", "yamamoto" );
	}
}
