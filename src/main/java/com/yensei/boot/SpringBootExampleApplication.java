package com.yensei.boot;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yensei.boot.dao.CountryRepository;
import com.yensei.boot.models.City;
import com.yensei.boot.models.Country;

@SpringBootApplication
public class SpringBootExampleApplication {
	
	@Autowired
	private CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}

	@PostConstruct
	public void init() {
		List<Country> list = new ArrayList<>();
		
		Country paraguay = new Country("Paraguay");
		Country uruguay = new Country("Uruguay");
		Country argentina = new Country("Argentina");
		Country colombia = new Country("Colombia");
		Country brasil = new Country("Brasil");
		City bsas = new City("Buenos Aires");
		City asuncion = new City("Asunción");
		City cde = new City("Ciudad del Este");
		City saopaulo = new City("Sao Paulo");
		City brasilia = new City("Brasilia");
		
		Set<City> cities = new HashSet<>();
		cities.add(cde);
		cities.add(asuncion);		
		paraguay.setCities(cities);
		
		cities = new HashSet<>();
		cities.add(saopaulo);
		cities.add(brasilia);
		brasil.setCities(cities);
		
		cities = new HashSet<>();
		cities.add(bsas);
		argentina.setCities(cities);
		
		
		list.add(argentina);
		list.add(uruguay);
		list.add(paraguay);
		list.add(colombia);
		list.add(brasil);
		
		
		countryRepository.saveAll(list);
	}
}
