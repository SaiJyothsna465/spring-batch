package com.sai.springboot.batch.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.sai.springboot.batch.entity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
	
}