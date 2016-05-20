package com.logos.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.logos.demo.dao.CityDAO;
import com.logos.demo.dto.PersonDTO;
import com.logos.demo.model.City;
import com.logos.demo.model.Departament;
import com.logos.demo.model.Person;
import com.logos.demo.service.CityService;

@Service
public class CityServiceImpl implements CityService {

	@Inject
	CityDAO citydao;

	@Override
	public City searchByName(String name) {
return citydao.searchCityByName(name);
	}

	@Override
	public City findById(Long id) {

		return citydao.findById(id);
	}

	@Override
	public void save(String name, int population, String description) {
		citydao.save(new City(name, population, description,null, null));
		;
	}

	@Override
	public void remove(City entity) {
		citydao.remove(entity);

	}

	@Override
	public void update(City entity) {
		citydao.update(entity);
	}

	@Override
	public List<City> findAll() {
		return citydao.findAll();
	}

	@Override
	public void save(City entity) {
		citydao.save(entity);
	}

	@Override 
	public void addDepartament(long id,String name)
	{
		citydao.findById(id).getDepartamentst().add(new Departament(name,null,this.findById(id)));
	}

	@Override
	public List<Departament> getAllDepartaments(long id) {
		
		return citydao.findById(id).getDepartamentst();
	}
	

}
