package com.example.microservice.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.microservice.model.Bill;

public interface BillRepository extends MongoRepository<Bill, String> {

	@Query("{'name': ?0}")
	Optional<Bill> findbyName(String name);
}
