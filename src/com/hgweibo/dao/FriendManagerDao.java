package com.hgweibo.dao;

import java.util.List;

import com.hgweibo.model.Care;
import com.hgweibo.model.FriendManager;
import com.hgweibo.model.User;

public interface FriendManagerDao {

	public List<FriendManager> friendList(String queryString,User user);
	
	public void insertFriend(Care care);
	
}
