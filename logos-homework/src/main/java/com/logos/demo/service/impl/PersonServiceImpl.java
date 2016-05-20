package com.logos.demo.service.impl;


import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

import com.logos.demo.dao.PersonDao;
import com.logos.demo.dao.RoleDao;
import com.logos.demo.model.Person;
import com.logos.demo.model.Role;
import com.logos.demo.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Inject
	private PersonDao personDao;
	@Inject
	private RoleDao roledao;
	
	public List<Person> getAll() {
		return personDao.findAll();
	}

	@Override
	public void save(Person person) {
		personDao.save(person);
	}

	@Override
	public Person getById(long id) {
		return personDao.findById(id);
	}


	public void save(Person person,String[] role) {
		List<Role> list=roledao.choseYourRoles(role);
		person.addRoles(list);
		personDao.save(person);	
	}

	@Override
	public void update(Person person) {
	personDao.update(person);
	}

}
