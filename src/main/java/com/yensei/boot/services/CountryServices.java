package com.yensei.boot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.yensei.boot.dao.CountryRepository;
import com.yensei.boot.models.Country;

@RestController
public class CountryServices {

	@Autowired
	private CountryRepository countryRepository;
	
	@GetMapping("/country")
	public Iterable<Country> getCountries(){
		return countryRepository.findAll();			
	}
	
	@GetMapping("/country/{id}")
	public Optional<Country> getCountry(@PathVariable Long id){
		return countryRepository.findById(id);			
	}
}
