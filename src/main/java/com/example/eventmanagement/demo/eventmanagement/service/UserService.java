package com.example.eventmanagement.demo.eventmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eventmanagement.demo.eventmanagement.entity.User;
import com.example.eventmanagement.demo.eventmanagement.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public void addUser() {
		User user = new User("Praharsh","Dave","praharsh@gmail.com","8571234567",25);
		
		userRepository.save(user);
	}
}
