package com.foodlasso.service;

import java.util.List;

import com.foodlasso.domain.User;
import com.foodlasso.repository.IUserDao;

public class UserManager implements IUserManager {
	private static final long serialVersionUID = -2023344586160816705L;
	private IUserDao userDao;
	
	public void setUserDao(IUserDao dao) { userDao = dao; }
	
	@Override
	public List<User> getUsers() {
		List<User> users = userDao.getUsers();
		return users;
	}

	@Override
	public User getUserById(int id) {
		User user = userDao.getUserById(id);
		return user;
	}

	@Override
	public User authenticateUser(String username, String password) {
		User user = userDao.authenticateUser(username, password);
		return user;
	}

}
