package com.hgweibo.dao;

import com.hgweibo.model.User;

public interface RegisterDao {

	public void addUser(String queryString,User user);
	public User findUserByName(String queryString ,User user);
}
