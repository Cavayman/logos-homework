package com.logos.demo.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.logos.demo.dto.PersonDTO;
import com.logos.demo.service.CityService;
import com.logos.demo.service.impl.CityServiceImpl;

@Controller
public class CityContoller {

	@RequestMapping(value = "/Allcity", method = RequestMethod.GET)
	public String getAllCity() {
		return "AllCity";
	}

	@Inject
	CityService cityserv;

	@RequestMapping(value = "/Allcity/getAll-{city}", method = RequestMethod.GET)
	public @ResponseBody List<PersonDTO> getPeronsInCity(@PathVariable("city") String cityName) {
		List<PersonDTO> temp = cityserv.getPersonDTO(cityName);
		return temp;
	}

}
