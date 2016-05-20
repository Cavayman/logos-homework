package com.logos.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Departament {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;

	@OneToOne(fetch = FetchType.EAGER)
	private Person depManager;

	@ManyToOne(fetch = FetchType.LAZY)
	private City city;

	@OneToMany(mappedBy = "departament")
	private List<Person> persons;

	// Constructor
	public Departament() {
		// TODO Auto-generated constructor stub
	}

	public Departament(String name, Person depManager, City city) {
		super();
		this.name = name;
		this.depManager = depManager;
		this.city = city;
	}
	// GETTERS & SETTERS

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getDepManager() {
		return depManager;
	}

	public void setDepManager(Person depManager) {
		this.depManager = depManager;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	//
	// TO String
	//
	@Override
	public String toString() {
		return "Departament [id=" + id + ", name=" + name + ", depManager=" + depManager + "]";
	}

}
