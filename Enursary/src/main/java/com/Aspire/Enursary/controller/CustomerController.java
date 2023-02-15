package com.Aspire.Enursary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Aspire.Enursary.Repo.CustomerInterface;
import com.Aspire.Enursary.entity.Customer;

@RestController
@RequestMapping("/Customer")
public class CustomerController {

	@Autowired
	private CustomerInterface obj;
	
	@PostMapping
	public String addCustomer(@RequestBody Customer c)
	{
		obj.save(c);
		return "Customer add successfully";
		
	}
	
	@GetMapping
	public List<Customer> getAllcusto()
	{
		return obj.findAll();
		
	}
}
