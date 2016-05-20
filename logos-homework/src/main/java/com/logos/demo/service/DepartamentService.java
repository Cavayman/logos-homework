package com.logos.demo.service;

import java.util.List;

import com.logos.demo.model.Departament;
import com.logos.demo.model.Person;

public interface DepartamentService {
	Departament findById(Long id);

	

	void remove(String name);


	List<Person> getAllPersonsInDepartament(String name);

	public long countPersons(String name); //counts persons in  department:name; 
	 
	public Departament findByName(String name); //finds Department with name; 
	
	public boolean changeManager(String departmentName,Person yourDepManager);

	void save(String name, long depManager, long cityId);






	Departament update(Departament dep);



	List<Departament> findAll(String name);
	

}
