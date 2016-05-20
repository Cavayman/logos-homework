package com.logos.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import com.logos.demo.model.Role;

public interface RoleDao extends BaseDao<Role,Short> {
	@Transactional
	public List<Role> getAllRoles(); //just gives you a list 
	@Transactional
	public List<Role> choseYourRoles(String[]roles); //gives you list of roles with  name like in *roles* 
	
	
}
