package com.hgweibo.dao;

import com.hgweibo.model.User;

public interface PersonUpdateDao {

	public User checkUser(String queryString,User user);
	public int personUpdata(String querysString,User user);
}
