package com.foodlasso.repository;

import java.util.List;

import com.foodlasso.domain.User;

public interface IUserDao {
	public List<User> getUsers();
	public User getUserById(int id);
	public User authenticateUser(String username, String password);
}
