package com.ramesh.springheroku.restcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HomeRestController {

	@GetMapping
	public String hello(){
		return "Hello docker container..";
	}

	@GetMapping("welcome")
	public String welcome(){
		return "Welcome Mr.Ramesh, This is docker image";
	}

}
