package com.logos.demo.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.logos.demo.model.Person;
import com.logos.demo.model.Role;
import com.logos.demo.service.PersonService;

@Controller
@RequestMapping("/registration")
public class RegistrationController {
	
	@Inject
	private PersonService personService;
	
	@RequestMapping(value="saveUser",method=RequestMethod.POST)
	public String RegistrateUser(@RequestParam(name="name")String name,
			@RequestParam(name="password")String password,
			@RequestParam(name="email")String email,
			@RequestParam(name="role")String [] roles
			)
	{
		Person person=new Person();
		person.setName(name);
		person.setPassword(password);
		person.setEmail(email);
		
		
		personService.save(person,roles);
		return "redirect:/home";
		
	}

}
