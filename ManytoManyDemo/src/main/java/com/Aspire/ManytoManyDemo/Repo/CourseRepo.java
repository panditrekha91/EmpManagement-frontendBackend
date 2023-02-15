package com.Aspire.ManytoManyDemo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Aspire.ManytoManyDemo.Entity.Course;


@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {

	List<Course> findByFeesLessThan(double fee);
}
