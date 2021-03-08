package com.ramesh.springheroku.restcontroller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trans")
public class TransactionRestController {

	@GetMapping
	public String trans(){
		return "Hello docker this is Transaction controller container..";
	}



}
