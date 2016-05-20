package com.logos.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private int population;
	private String description;
	//local manager
	@OneToOne(fetch = FetchType.EAGER)
	private Person locManager;
	//LIST OF DEPARTAMENTS !!!!
	@OneToMany(mappedBy = "city")
	private List<Departament> departamentst;

	// without fields
	public City() {
		// TODO Auto-generated constructor stub
	}

	// with fields
	public City(String name, int population, String description, List<Departament> departamentst,Person locManager) {
		super();
		this.name = name;
		this.population = population;
		this.description = description;
		this.departamentst = departamentst;
		this.locManager=locManager;
	}

	//
	// GETTERS AND SETTERS
	//
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

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Departament> getDepartamentst() {
		return departamentst;
	}

	public void setDepartamentst(List<Departament> departamentst) {
		this.departamentst = departamentst;
	}

	public Person getLocManager() {
		return locManager;
	}

	public void setLocManager(Person locManager) {
		this.locManager = locManager;
	}
	
	//TO STRING
	
	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", population=" + population + ", description=" + description
				+ ", locManager=" + locManager + "]";
	}
	
	

}
