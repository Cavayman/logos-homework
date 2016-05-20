package com.logos.demo.controller;

import java.lang.invoke.MethodHandles;
import java.security.Principal;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.logos.demo.service.PersonService;



@Controller
public class MyPageController {

	private static final Logger logger = Logger.getLogger(MethodHandles.lookup().lookupClass());

	@Inject
	PersonService personService ;
	
	@RequestMapping(value = {"/my-page" }, method = RequestMethod.GET)
	public String myPage(Model model, HttpServletRequest request,Principal principal) {

		
		long id = Long.parseLong(principal.getName());
		
		model.addAttribute("person" ,personService.getById(id));
		
		return "myPage";
	}

}


