package com.ramesh.springheroku.restcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

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

	@PostMapping
	public String postwelcome(@RequestParam String strv){
		return "This is Post mapping content "+strv;
	}

}
