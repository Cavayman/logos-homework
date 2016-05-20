package com.logos.demo.dao;

import javax.transaction.Transactional;

import com.logos.demo.model.Person;

public interface PersonDao extends BaseDao<Person, Long> {
	@Transactional
	Person findByEmail(String email);

}
