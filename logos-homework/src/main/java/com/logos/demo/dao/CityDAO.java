package com.logos.demo.dao;

import java.util.List;

import com.logos.demo.model.City;
import com.logos.demo.model.Departament;
import com.logos.demo.model.Person;

public interface CityDAO extends BaseDao<City,Long>{
	public List<Departament> findAllDepart(String name);
	public List<Person> AllPersonsInCity(String name);
	public boolean changeManager(String name,Person localManager); //change your old Manager to  new one
	City searchCityByName(String name);
	
	

}
