package com.Aspire.ExceptionHandlingDemo.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Aspire.ExceptionHandlingDemo.Exception.UserNotFountException;
import com.Aspire.ExceptionHandlingDemo.Repo.UserInterface;
import com.Aspire.ExceptionHandlingDemo.Service.UserService;
import com.Aspire.ExceptionHandlingDemo.User.User;

@RestController
public class UserController {

	@Autowired
	private UserInterface obj;
	
	
	@PostMapping("/adduser")
	public ResponseEntity<User> saveUser(@Valid @RequestBody User u)
	{
		return new ResponseEntity<>(obj.save(u),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getall")
	public List<User> getalluser()
	{
		return obj.findAll();
	}
	
	
	// here we are handling the custom  exception to creating class of UserNotFountException
	@GetMapping("/getbyid")
	public User getbyid(@RequestParam int id)throws UserNotFountException
	{
		User u=obj.findById(id).get();
		return u;
//		if(u!=null) {
//			return u;
//		}
//		else {
//			throw new UserNotFountException("user not found with this id:"+id);
//		}
//		
	}
	
	
	
}
