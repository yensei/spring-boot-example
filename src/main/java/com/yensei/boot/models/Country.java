package com.yensei.boot.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Country {

	@Id @GeneratedValue
	private long id;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="cityId")
	private Set<City> cities;
	
	public Country() {
		super();
	}
	
	public Country( String name) {
		super();		
		this.name = name;
	}
	
	@Override
	public String toString() {		
		return "id: "+ id + " => "+name;
	}
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

	public Set<City> getCities() {
		return cities;
	}

	public void setCities(Set<City> cities) {
		this.cities = cities;
	}
	
	
}