package com.juaracoding.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class WebController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/dedi")
	public String dedi() {
		return "dedi";
	}
	
}
