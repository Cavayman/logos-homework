package com.logos.demo.dao.impl;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.transaction.annotation.Transactional;

import com.logos.demo.dao.DepartmentDao;
import com.logos.demo.model.City;
import com.logos.demo.model.Departament;
import com.logos.demo.model.Person;
import com.logos.demo.model.Role;

public class DepartamentDaoImpl extends BaseDaoImpl<Departament, Long> implements DepartmentDao{

	public DepartamentDaoImpl() {
		super(Departament.class);
	
	}

	@Override
	public long countPersons(String name) {
		try {
			Departament temp=(Departament) entityManager.createQuery("select d from departament p where p.name=:name").setParameter("name",name).getSingleResult();
			return temp.getPersons().size();
		} catch (NoResultException e) {
				return 0;}
	}

	@Override
	public Departament findByName(String name) {
		try {
			return (Departament) entityManager.createQuery("select c from Departament c where c.name=:name").setParameter("name",name).getSingleResult();
			} catch (NoResultException e) {
				return null;}
	}

	
	@Override
	@Transactional
	public boolean changeManager(String departmentName, Person yourDepManager) {
	
			Departament temp=(Departament) entityManager.createQuery("select c from Departament c where c.name=:name").setParameter("name",departmentName).getSingleResult();
		
			
				if(temp.getDepManager().equals(yourDepManager))return true;
				if(!temp.getDepManager().equals(yourDepManager))
					{temp.setDepManager(yourDepManager);
					entityManager.merge(temp);
					return true;
					}
				else return false;
	
		
	}

}
