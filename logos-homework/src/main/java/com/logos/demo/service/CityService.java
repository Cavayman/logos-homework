package com.logos.demo.service;

import java.util.List;

import com.logos.demo.dto.PersonDTO;
import com.logos.demo.model.City;
import com.logos.demo.model.Departament;
import com.logos.demo.model.Person;

public interface CityService {
	
	public City searchByName(String name);

	City findById(Long id);

	void save(String name, int population, String description);


	void remove(City entity);

	void update(City entity);

	List<City> findAll();

	void save(City entity);
	
	List<Departament> getAllDepartaments(long id);//Finds departaments throu cityid

	void addDepartament(long id, String name);
}
