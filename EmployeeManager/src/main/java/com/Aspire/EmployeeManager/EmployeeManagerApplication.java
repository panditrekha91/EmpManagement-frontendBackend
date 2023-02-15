package com.Aspire.EmployeeManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagerApplication.class, args);
		System.out.println("this is employee manager application");
		
		// Here we are adding the validations
		//use @requestParam 
		// use pagination concept here
		
		
	}

}
