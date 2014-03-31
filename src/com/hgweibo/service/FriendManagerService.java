package com.hgweibo.service;

import java.util.List;

import com.hgweibo.model.Care;
import com.hgweibo.model.FriendManager;
import com.hgweibo.model.User;

public interface FriendManagerService {

	public List<FriendManager> getFriends(User user);
	
	public abstract void insertCareToFriend(Care care);
}
