package com.javasampleapproach.jpamysqlangular4.repo;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.javasampleapproach.jpamysqlangular4.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, Long> {
	List<Customer> findByLastName(String lastName);
}