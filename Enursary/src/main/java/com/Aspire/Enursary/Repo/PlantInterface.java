package com.Aspire.Enursary.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Aspire.Enursary.entity.Plants;

@Repository
public interface PlantInterface extends JpaRepository<Plants, Integer> {

	
	
	
}
