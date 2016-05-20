package com.logos.demo.dao.impl;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.logos.demo.dao.PersonDao;
import com.logos.demo.model.Person;

@Repository
public class PersonDaoImpl extends BaseDaoImpl<Person, Long> implements PersonDao {

	public PersonDaoImpl() {
		super(Person.class);
	}

	@Transactional
	public Person findByEmail(String email) {
		try {
			return (Person) entityManager.createNamedQuery(Person.FIND_BY_EMAIL).setParameter("email", email).getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

	

}
