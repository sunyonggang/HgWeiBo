package com.hgweibo.dao;

import java.util.List;

import com.hgweibo.model.User;

public interface UserDao {
	public void addUser(User user);
	public void deleteUser(User user);
	public void updateUser(User user);
	public List<User> findUsers(User user);
	public User findUserByOption(User user);

}
