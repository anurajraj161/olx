package com.javainuse.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javainuse.common.Product;
import com.javainuse.model.DAOUser;

@Repository
public interface UserDao extends CrudRepository<DAOUser, Integer> {
	
  public DAOUser getUser(Long Id);

public DAOUser findByUsername(String username);
	
	
	
}