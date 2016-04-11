package com.beingjavaguys.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class Home {
	String message = "Welcome to your 1st Maven Spring project !";

	@RequestMapping("/hello")
	public ModelAndView showMessage() {
		System.out.println("from controller");
		return new ModelAndView("hello", "message", message);
	}
}
