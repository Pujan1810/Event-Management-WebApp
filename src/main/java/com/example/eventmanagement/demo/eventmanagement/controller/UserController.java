package com.example.eventmanagement.demo.eventmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eventmanagement.demo.eventmanagement.entity.User;
import com.example.eventmanagement.demo.eventmanagement.repository.UserRepository;
import com.example.eventmanagement.demo.eventmanagement.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	UserService userService;
	@PostMapping(value="/add", consumes= {"*/*"})
	public ResponseEntity add() {
		userService.addUser();
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	
	
	
	
	
	
}
