package com.example.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootOpenshift2Application {

	public static void main(String[] args) {
		System.out.println("Reaching main");
		SpringApplication.run(SpringbootOpenshift2Application.class, args);
	}


	@GetMapping("/")
	public String getMessage()
	{
		return "Wow! openshift working!";
	}

	@PostMapping("/{name}")
	public String postMessage(@PathVariable String name)
	{
		return "Wow! Your name is :"+name;
	}

}
