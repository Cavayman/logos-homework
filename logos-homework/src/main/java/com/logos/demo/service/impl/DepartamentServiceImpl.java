package com.logos.demo.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.logos.demo.dao.CityDAO;
import com.logos.demo.dao.DepartmentDao;

import com.logos.demo.model.Departament;
import com.logos.demo.model.Person;
import com.logos.demo.service.DepartamentService;

public class DepartamentServiceImpl implements DepartamentService {
	@Inject
	DepartmentDao depdao;
	@Inject
	CityDAO cityDao;
	
	@Override
	public Departament findById(Long id) {
		
		return depdao.findById(id);
	}

	@Override
	public void save(String name,long depManager,long cityId) {
		
		depdao.save(new Departament(name,null, cityDao.findById(cityId)));
	}

	@Override
	public void remove(String name) {
		depdao.remove(depdao.findByName(name));
	}

	@Override
	public Departament update(Departament dep) {
		depdao.update(dep);
		return depdao.findByName(dep.getName());
	}

	@Override
	public List<Departament> findAll(String name) {
 return	cityDao.findAllDepart(name);
	}

	@Override
	public long countPersons(String name) {
		return	depdao.countPersons(name);
		 
	}

	@Override
	public Departament findByName(String name) {
	
		return depdao.findByName(name);
	}

	@Override
	public boolean changeManager(String departmentName, Person yourDepManager) {
		if( depdao.changeManager(departmentName, yourDepManager))
		return true;
		else return false;
	}

	@Override
	public List<Person> getAllPersonsInDepartament(String name) {
		 
		return	depdao.findByName(name).getPersons();
	}

}
