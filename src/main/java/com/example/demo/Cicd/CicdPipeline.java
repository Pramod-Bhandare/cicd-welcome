package com.example.demo.Cicd;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CicdPipeline {
	
	@GetMapping("/")
	public String CicdAction() {
		return "CI/CD Application is Running!!!!";
	}
	
	@GetMapping("/welcome")
	public String CicdAction1() {
		return "Some thing changed in project with the help of permission of owner!";
	}
	
	@GetMapping("/welcome1")
	public String CicdAction2() {
		return "This is to checking prepose Second Get API , Just I am Trying !!";
	}
	
	@GetMapping("/welcome2")
	public String CicdAction3() {
		return "Annother try !!!";
	}
	
	
}
