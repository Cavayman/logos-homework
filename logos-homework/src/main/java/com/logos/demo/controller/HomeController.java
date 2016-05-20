package com.logos.demo.controller;

import java.lang.invoke.MethodHandles;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.logos.demo.service.CityService;

@Controller
public class HomeController {

	private static final Logger logger = Logger.getLogger(MethodHandles.lookup().lookupClass());

	@RequestMapping(value ={"/","/home"} , method = RequestMethod.GET)
	public String home(Model model, HttpServletRequest request) {
		return "home";
	}
	@RequestMapping(value ="/registration")
	public String registration(Model model, HttpServletRequest request) {

		return "registration";
	}
	@RequestMapping(value ="/login_user")
	public String updateHome(Model model, HttpServletRequest request) {

		return "redirect:home";
	}
	


}
