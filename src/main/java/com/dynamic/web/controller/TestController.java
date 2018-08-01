package com.dynamic.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/index")
	public String index(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("abdfsdf");
		return "index";
	}

}
