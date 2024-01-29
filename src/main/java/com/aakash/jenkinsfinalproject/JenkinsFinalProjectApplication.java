package com.aakash.jenkinsfinalproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsFinalProjectApplication {

	@GetMapping
	public String message(){
		return "Welcome to Spring Microservices";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsFinalProjectApplication.class, args);
	}

}
