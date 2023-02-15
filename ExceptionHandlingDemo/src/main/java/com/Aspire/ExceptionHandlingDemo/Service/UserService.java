package com.Aspire.ExceptionHandlingDemo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Aspire.ExceptionHandlingDemo.Repo.UserInterface;
import com.Aspire.ExceptionHandlingDemo.User.User;

@Service
public class UserService {

		@Autowired
		private UserInterface obj;
	
		public User adduser(User user)
		{
			
			User u=new User();
	
			return obj.save(u);
			
			
		}
		
		public List<User> getAlluser()
		{
			return obj.findAll();
				
		}
		
		public Optional<User> getbyid(int id)
		{
			return obj.findById(id);
			
		}
		
}
