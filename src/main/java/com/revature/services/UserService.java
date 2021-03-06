package com.revature.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.daos.IUserDAO;
import com.revature.daos.UserDAO;
import com.revature.models.User;

public class UserService {
	private static final Logger log = LogManager.getLogger(UserService.class);
	private static IUserDAO uDao= new UserDAO();
//	
//	public List<User> findAll(){
//		log.info("Retrieving all users");
//		return uDao.selectAll();
//	}

	public User findById(int id) {
		log.info("Finding User with id "+ id);
		return uDao.selectById(id);
	}
	
	public User findByUserPassword(String username, String password) {
		log.info("Finding User with username: "+ username + " and password: " + password);
		return uDao.selectByCredentials(username, password);
	}

	public User findByUsername(String username) {
		log.info("Finding User with username: "+ username);
		return uDao.selectByUsername(username);
	}
	
	
	public boolean addUser(User u) {
		log.info("Adding User: "+ u);
		return uDao.insertUser(u);
	}
	
	public boolean updateUser(User u) {
		log.info("Updating User: "+ u);
		return uDao.updateUser(u);
	}
	
	
}
