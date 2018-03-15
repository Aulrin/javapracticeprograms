package com.niit.backend.daoimpl;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.domain.User;
import com.niit.backend.dao.UserDAO;
@Transactional
@Repository("userDAO")
public class UserDAOimpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean save(User user) {
		try {
			user.setRole('c');
		    sessionFactory.getCurrentSession().save(user);
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean update(User user) {
		try {
			 sessionFactory.getCurrentSession().update(user);
			return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}
	}
	public User get(String emailid) {
		sessionFactory.getCurrentSession().load(User.class, emailid);
		return null;
		
	}

	public boolean delete(String emailid) {
		 return false;
		}

		
	}
