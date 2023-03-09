package com.phmqz.course.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phmqz.course.entities.User;

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Alceu", "alceu@alceu.com", "98989898", "654321");
		
		return ResponseEntity.ok().body(u);
	}
	
}
