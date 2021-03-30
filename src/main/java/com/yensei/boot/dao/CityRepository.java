package com.yensei.boot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.yensei.boot.models.City;

@RestResource(path = "cities", rel = "cities")
public interface CityRepository extends CrudRepository<City, Long> {

}
