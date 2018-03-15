package com.niit.backend.dao;

import com.niit.backend.domain.User;

public interface UserDAO {
	
	
	public  boolean   save(User user);
	
	public  boolean   update(User user);
	
	public User get(String emailid);
  	
	public boolean delete(String emailid);


}
