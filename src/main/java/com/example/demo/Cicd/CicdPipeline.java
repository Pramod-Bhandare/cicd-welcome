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
}
