package com.yensei.boot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.yensei.boot.models.Country;

@RestResource(path="countries", rel="countries")
public interface CountryRepository extends CrudRepository<Country, Long> {

}
