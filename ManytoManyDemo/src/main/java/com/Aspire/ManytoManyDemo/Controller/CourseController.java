package com.Aspire.ManytoManyDemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Aspire.ManytoManyDemo.Entity.Course;
import com.Aspire.ManytoManyDemo.Repo.CourseRepo;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private CourseRepo obj2;

//	public CourseController(CourseRepo obj2) {
//		super();
//		this.obj2 = obj2;
//	}
//	
	@PostMapping
	public Course save(@RequestBody Course c)
	{
		return obj2.save(c);
	}
	
	@GetMapping
	public List<Course> getAllcourse()
	{
		return obj2.findAll();
	}
	
}
