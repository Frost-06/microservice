package com.example.microservice.arearepository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.microservice.circle.areaofcircle;

public interface repository extends MongoRepository<areaofcircle, String> {

	@Query("{'name': ?0}")
	Optional<areaofcircle> findbyName(String name);
}
