package com.logos.demo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import com.logos.demo.dao.CityDAO;
import com.logos.demo.dao.PersonDao;
import com.logos.demo.model.City;
import com.logos.demo.model.Departament;
import com.logos.demo.model.Person;
@Repository
public class CityDaoImp extends BaseDaoImpl<City, Long> implements CityDAO {


	public CityDaoImp() {
		super(City.class);
	}

	@Override
	public City searchCityByName(String name) {
		try {
		return (City) entityManager.createQuery("select c from City c where c.name=:name").setParameter("name",name).getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
		
	}

	@Override
	public List<Departament> findAllDepart(String name) {
		return searchCityByName(name).getDepartamentst();

	}

	@Override
	public List<Person> AllPersonsInCity(String name) {
		List<Person> AllPersons=new ArrayList<Person>();

		List<Departament> tempDepart=findAllDepart(name);
		for(Departament departament:tempDepart)
		{
			AllPersons.addAll(departament.getPersons());
		}
		return AllPersons;
	}

	@Override
	public boolean changeManager(String name, Person localManager) {
		City temp=searchCityByName(name);
		if(temp.getLocManager().equals(localManager))return true;
		if(!temp.getLocManager().equals(localManager))
			{temp.setLocManager(localManager);
			entityManager.merge(temp);
			return true;
			}
		else return false;
	}

}
