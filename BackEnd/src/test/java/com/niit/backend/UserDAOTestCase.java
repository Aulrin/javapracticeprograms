package com.niit.backend;

import static org.junit.Assert.*;


import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.dao.UserDAO;
import com.niit.backend.domain.User;

public class UserDAOTestCase {

	private static AnnotationConfigApplicationContext context;
	
	@Autowired
	private static UserDAO userDAO;
	
	@Autowired
	private static User user;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		userDAO = (UserDAO)context.getBean("userDAO");
		user=(User)context.getBean("user");
}
	@Test
	public void saveUserTestCase()
	{
		user.setEmailid("mike@gmail.com");
		user.setRole('e');
		user.setName("Micheal");
		user.setPassword("mike@123");
	
		boolean status=userDAO.save(user);
		assertEquals("save user test case",true,status);
		
	}
}