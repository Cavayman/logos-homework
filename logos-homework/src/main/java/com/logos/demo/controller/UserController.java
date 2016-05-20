package com.logos.demo.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.logos.demo.model.Person;
import com.logos.demo.service.PersonService;

@Controller

public class UserController {

	@Inject
	private PersonService personService;

	@RequestMapping(value = "users", method = RequestMethod.GET)
	public String getAll(Model model, HttpServletRequest request) {
		model.addAttribute("personList", personService.getAll());
		return "users";
	}

	@RequestMapping(value = "/users/save", method = RequestMethod.POST)
	public String save(@RequestParam(name = "name") String name) {
		personService.save(new Person(name));
		return "redirect:/users";
	}

	// ACTIVATE
	@RequestMapping(value = "/users/activate/{id}", method = RequestMethod.GET)
	public String activate(@PathVariable("id") long id) {
		Person temp = personService.getById(id);
		temp.setActivated(true);
		personService.update(temp);
		return "redirect:/users";
	}

	// DEACTIVATE
	@RequestMapping(value = "/users/deactivate/{id}", method = RequestMethod.GET)
	public String Deactivate(@PathVariable("id") long id) {
		Person temp = personService.getById(id);
		temp.setActivated(false);
		personService.update(temp);
		return "redirect:/users";
	}
	@RequestMapping(value = "users/click", method = RequestMethod.GET)
	public @ResponseBody String click() {
		Person person=personService.getById(1);
		
		return null;
	}

	

}
