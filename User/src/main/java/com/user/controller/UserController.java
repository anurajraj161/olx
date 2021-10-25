package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.user.service.UserService;

import com.user.entity.User;



@RequestMapping("{username}")
@RestController
public class UserController {
	
	private UserService userService;
	
	
	
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	
	@GetMapping("/all")
	public ResponseEntity<List<User>> getAll() {
		return ResponseEntity.ok(userService.findAll());
	}
	
	@GetMapping("/{Pid}")
	public ResponseEntity<User> findById(@PathVariable Long Pid) {
		return ResponseEntity.ok(userService.findById(Pid).orElse(null));
	}
	
	@PutMapping("{username}/add")
	public ResponseEntity<User> createNew(@RequestBody User p) {
		return ResponseEntity.ok(userService.save(p)); 
	}
	
	@PostMapping("/update")
	public ResponseEntity<User> update(@RequestBody User p) {
		return ResponseEntity.ok(userService.save(p));
	}
	
	

	@DeleteMapping("/{Pid}")
	public ResponseEntity<User> delete(@PathVariable Long Uid) {
		userService.findById(Uid).ifPresent(userService::delete);
		return ResponseEntity.ok().build();
	}
}
