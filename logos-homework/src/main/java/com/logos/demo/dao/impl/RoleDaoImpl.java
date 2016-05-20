package com.logos.demo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.logos.demo.dao.RoleDao;
import com.logos.demo.model.Person;
import com.logos.demo.model.Role;

@Repository
public class RoleDaoImpl extends BaseDaoImpl<Role,Short> implements RoleDao{
	@PersistenceContext(name = "logos")
	EntityManager manager;

	public RoleDaoImpl() {
		super(Role.class);
	}

	@Override
	public List<Role> getAllRoles() {
		return manager.createQuery("select * from Role").getResultList();
		
	}

	@Override
	public List<Role> choseYourRoles(String[] roles) {
		List<Role> list = new ArrayList<Role>();
		for(int i=0;i<roles.length;i++)
		list.add((Role) manager.createQuery("SELECT r FROM Role r WHERE r.name=:name")
				.setParameter("name",roles[i].toString()).getSingleResult());

		return list;
	}
	
	
}
