package com.Aspire.ManytoManyDemo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Aspire.ManytoManyDemo.Entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

	List<Student> findByNameContaining(String name);
}
