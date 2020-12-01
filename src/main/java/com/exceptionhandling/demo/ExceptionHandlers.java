package com.exceptionhandling.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlers {
	
	@ExceptionHandler
	public ResponseEntity<Object> myMessage(CustomException e)
	{
		System.out.println("Exception Here");
		return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_GATEWAY);
	}


}
