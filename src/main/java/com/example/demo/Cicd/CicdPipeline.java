package com.example.demo.Cicd;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CicdPipeline {
	
	@GetMapping("/")
	public String CicdAction() {
		return "CICD Pipeline Application is running!";
	}
	
	@GetMapping("/welcome")
	public String CicdAction1() {
		return "Some thing changed in project with the help of permission of owner!";
	}
	
	
}
