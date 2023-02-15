package com.Aspire.Enursary.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Aspire.Enursary.entity.Customer;

@Repository
public interface CustomerInterface extends JpaRepository<Customer, Integer> {

	
	
}
