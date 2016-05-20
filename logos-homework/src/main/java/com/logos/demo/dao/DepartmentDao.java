package com.logos.demo.dao;

import java.util.List;

import com.logos.demo.model.Departament;
import com.logos.demo.model.Person;
import com.logos.demo.model.Role;

public interface DepartmentDao extends BaseDao<Departament,Long>{

	public long countPersons(String name); //counts persons in  department:name; 
	 
	public Departament findByName(String name); //finds Department with name; 
	
	public boolean changeManager(String departmentName,Person yourDepManager);
	

	
	
}
