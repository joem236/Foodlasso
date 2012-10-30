package com.foodlasso.service;

import java.io.Serializable;
import java.util.List;

import com.foodlasso.domain.User;

public interface IUserManager extends Serializable {
	public List<User> getUsers();
	public User getUserById(int id);
	public User authenticateUser(String username, String password);
}
