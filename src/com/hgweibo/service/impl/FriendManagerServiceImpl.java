package com.hgweibo.service.impl;

import java.util.List;

import com.hgweibo.dao.FriendManagerDao;
import com.hgweibo.model.Care;
import com.hgweibo.model.FriendManager;
import com.hgweibo.model.User;
import com.hgweibo.service.FriendManagerService;

public class FriendManagerServiceImpl implements FriendManagerService {

	private FriendManagerDao friendManagerDao;
	public List<FriendManager> getFriends(User user) {
		List<FriendManager> lists = friendManagerDao.friendList("showFriend", user);
		return lists;
	}
	public FriendManagerDao getFriendManagerDao() {
		return friendManagerDao;
	}
	public void setFriendManagerDao(FriendManagerDao friendManagerDao) {
		this.friendManagerDao = friendManagerDao;
	}
	@Override
	public void insertCareToFriend(Care care) {
		// TODO Auto-generated method stub
		this.friendManagerDao.insertFriend(care);
	}

}
