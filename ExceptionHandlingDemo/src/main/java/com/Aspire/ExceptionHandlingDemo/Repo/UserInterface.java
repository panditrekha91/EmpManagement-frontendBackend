package com.Aspire.ExceptionHandlingDemo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Aspire.ExceptionHandlingDemo.User.User;

public interface UserInterface extends JpaRepository<User, Integer>{

}
