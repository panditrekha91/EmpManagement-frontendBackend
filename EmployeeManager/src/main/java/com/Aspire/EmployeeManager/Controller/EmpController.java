package com.Aspire.EmployeeManager.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Aspire.EmployeeManager.Entity.Employee;
import com.Aspire.EmployeeManager.Repository.EmpInterface;

@RestController
@RequestMapping("/employee")
public class EmpController {

	@Autowired
	private EmpInterface obj;
	

	@PostMapping
	public String empadd(@Valid @RequestBody Employee e)
	{
		obj.save(e);
		return "Employee add successfully";	
	}
	@GetMapping
	public List<Employee> fetchemp()
	{
		return obj.findAll();
	}
	
	@DeleteMapping("{empid}")
	public String deleteemp(@RequestParam long empid)
	{
		obj.deleteById(empid);
		return "employee deleted successfully";
		
	}
	
	@GetMapping("/findbyspecificid")
	public Optional<Employee> getbyid(@RequestParam long empid)
	{
		return obj.findById(empid);
		
	}
	
	// update the record
	@PutMapping
	public ResponseEntity<Employee> updateemp(@RequestParam long empid, @Valid @RequestBody Employee e)
	{
		Employee emp=obj.findById(empid).get();
		
		emp.setName(e.getName());
		emp.setAddress(e.getAddress());
		emp.setEmailid(e.getEmailid());
		emp.setSalary(e.getSalary());
		emp.setPassword(e.getPassword());
		obj.save(emp);
		return ResponseEntity.ok(emp);
		
	}
	
	
	
	
	@GetMapping("/paginnation")
	public List<Employee> getempbyPage(@RequestParam(defaultValue="0") Integer pageNo,
			@RequestParam(defaultValue="5") Integer pageSize)
	{
	//	Pageable paging=PageRequest.of(pageNo,pageSize);
		Pageable paging=PageRequest.of(pageNo, pageSize);
		
		Page<Employee> presult=obj.findAll(paging);
		
		List<Employee> list=(List<Employee>) presult.getContent();
		return list;
	
		
	}
	
	
	
	
}
