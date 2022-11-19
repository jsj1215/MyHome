package com.example.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping
	public String index() {
		
		String check = "ddd";
		String check2 = check+"2";
		
		return "index";
	}

}
