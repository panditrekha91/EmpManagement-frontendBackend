
package com.Aspire.ManytoManyDemo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Aspire.ManytoManyDemo.Entity.Student;
import com.Aspire.ManytoManyDemo.Repo.CourseRepo;
import com.Aspire.ManytoManyDemo.Repo.StudentRepo;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentRepo obj;
	
	
//	public StudentController(StudentRepo obj) {
//		super();
//		this.obj = obj;
//		}
//	
	@PostMapping
	public Student save(@RequestBody Student s)
	{
		return obj.save(s);
		
	}
	@GetMapping
	public List<Student> getall()
	{
		return obj.findAll();
		
	}
	
	@GetMapping("/getbyid")
	public Optional<Student> getByid(@RequestParam int sid)
	{
		return obj.findById(sid);
		
	}
	
	@GetMapping("/getbyname")
	public String sample()
	{
		return "hello rekha pandit";
		
	}
	
}
