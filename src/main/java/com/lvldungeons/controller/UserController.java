package com.lvldungeons.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lvldungeons.entity.User;

@RestController
@RequestMapping(path = "test")
public class UserController {

	private ArrayList<User> users = new ArrayList<User>();
	
	@GetMapping("/users")
	public ResponseEntity<?> getUsers() {
		return ResponseEntity.status(HttpStatus.OK).body(users);
	}
	
	@PostMapping("/user")
	public ResponseEntity<?> addCard(@RequestBody User user) {
		users.add(user);
		return ResponseEntity.status(HttpStatus.OK).body(user);
	}
}
