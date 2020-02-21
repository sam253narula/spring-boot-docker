package com.spring.boot.docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.docker.dto.MyIntroductionDTO;
import com.spring.boot.docker.service.ExampleService;

@RestController
@RequestMapping("/LombokDemo")
public class ExampleController {

	@Autowired
	ExampleService example;

	@GetMapping("/hello")
	public String Hello() {
		return example.Hello();
	}
	
	@GetMapping("/helloJenkins")
	public String HelloJenkins() {
		return "Hello Jenkins";
	}

	@PostMapping("/myInfo/{name}/{experiance}/{skills}")
	public MyIntroductionDTO myInfo(@PathVariable String name, @PathVariable String experiance, @PathVariable String skills) {
		return MyIntroductionDTO.builder().name(name).experiance(experiance).skills(skills).build();
		
	}
}
