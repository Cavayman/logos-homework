package com.logos.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = Person.FIND_BY_EMAIL, query = "SELECT p FROM Person p WHERE p.email = :email") })
public class Person {

	public static final String FIND_BY_EMAIL = "Person.findByEmail";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String password;
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE) 
	@JoinTable(name = "person_role", joinColumns = { 
	@JoinColumn(name = "PERSON_ID", nullable = false, updatable = false) }, 
	inverseJoinColumns = { @JoinColumn(name = "ROLE_ID", 
	nullable = false, updatable = false) })
	private List<Role> roles = new ArrayList<>();
	
	@ManyToOne
	private Departament departament;
	
	private boolean activated; //User activation
	//Accepted departament
	private boolean acceptedDep;
	//Accepted local
	private boolean acceptedLoc;
	
	//Constructor
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String email, String password, List<Role> roles, Departament departament,
			boolean activated, boolean acceptedDep, boolean acceptedLoc) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.roles = roles;
		this.departament = departament;
		this.activated = activated;
		this.acceptedDep = acceptedDep;
		this.acceptedLoc = acceptedLoc;
	}

	//GETTERS AND SETTERS 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	public boolean isAcceptedDep() {
		return acceptedDep;
	}

	public void setAcceptedDep(boolean acceptedDep) {
		this.acceptedDep = acceptedDep;
	}

	public boolean isAcceptedLoc() {
		return acceptedLoc;
	}

	public void setAcceptedLoc(boolean acceptedLoc) {
		this.acceptedLoc = acceptedLoc;
	}
	//
	//ADD ROLES
	//
	public void addRoles(List<Role> c)
	{
		this.roles.addAll(c);
	}

	public static String getFindByEmail() {
		return FIND_BY_EMAIL;
	}
	
	
	
	
	
	
	

}
