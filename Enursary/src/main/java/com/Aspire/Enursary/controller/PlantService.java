package com.Aspire.Enursary.controller;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Aspire.Enursary.Repo.PlantInterface;
import com.Aspire.Enursary.entity.Plants;

@Service
public class PlantService {

	
	private PlantInterface obj;
	
	
	public List<Plants> getAllplants ()
	{
		
		List<Plants> li=obj.findAll();
		return li;
		
		
		
	}
	
}
