package com.user.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entity.User;

public interface UserService extends JpaRepository<User, Long> {

   
}