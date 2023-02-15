package com.Aspire.ExceptionHandlingDemo.Exception;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserExceptionhandler {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> errorhandling(MethodArgumentNotValidException ex)
	{
		Map<String, String> errormap=new HashMap();
		
		ex.getBindingResult().getAllErrors().forEach((error) ->{

			String fieldName = ((FieldError) error).getField();
			String message = error.getDefaultMessage();
			errormap.put(fieldName,message);
		});
		
		

		
		return errormap;
		
	}
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(UserNotFountException.class)
	public Map<String, String> customexception(UserNotFountException ex)
	{
		
Map<String, String> errormap=new HashMap();
		
					errormap.put("message",ex.getMessage());
		

		return errormap;
		
	}
	
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(NoSuchElementException.class)
	public Map<String, String> notuserfoundexc(NoSuchElementException ex)
	{
		
					Map<String, String> errormap=new HashMap();
		
					errormap.put("errormessage",ex.getMessage());
		

		return errormap;
		
	}

}
