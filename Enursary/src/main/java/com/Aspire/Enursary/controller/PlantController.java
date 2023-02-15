package com.Aspire.Enursary.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Aspire.Enursary.Repo.PlantInterface;
import com.Aspire.Enursary.entity.Plants;

@RestController
public class PlantController {

		@Autowired
		private PlantInterface obj;
	 

	@GetMapping("/welcome")
	public String welostring()
	{
		return "hellow Rekha";
	}
	
	
	@PostMapping("/add-data")
	public String addplant(@RequestBody Plants p)
	{
		System.out.println("lets check"+p.getName());
		obj.save(p);
		return "plants added successfully";
		
	}
	
	@GetMapping("/getplant")
	public List<Plants> getAll()
	{	
		return obj.findAll();

	}
	
	@GetMapping("/pagination")
	public List<Plants> getbypage(@RequestParam int pageno, @RequestParam int paseSize)
	{
		Pageable p=PageRequest.of(pageno, paseSize);
		
		Page<Plants> page=obj.findAll(p);
		
		return page.getContent();
		
	}
	
	


	
	
	
	 
	
	
}
