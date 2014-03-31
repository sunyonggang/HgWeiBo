package com.hgweibo.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.hgweibo.dao.FriendManagerDao;
import com.hgweibo.model.Care;
import com.hgweibo.model.FriendManager;
import com.hgweibo.model.User;

public class FriendManagerDaoImpl extends SqlMapClientDaoSupport implements
		FriendManagerDao {

	@SuppressWarnings("unchecked")
	public List<FriendManager> friendList(String queryString, User user) {
		// TODO Auto-generated method stub
		List<FriendManager> lists = (List<FriendManager>)this.getSqlMapClientTemplate().queryForList(queryString, user);
		return lists;
	}

	@Override
	public void insertFriend(Care care) {
		// TODO Auto-generated method stub
		User user1 = (User)this.getSqlMapClientTemplate().queryForObject("cffind",care);
		User user2 = (User)this.getSqlMapClientTemplate().queryForObject("cfrfind",care);
		FriendManager friendManager1 = new FriendManager();
		FriendManager friendManager2 = new FriendManager();
		friendManager1.setUsersId(user1.getUsersId());
		friendManager1.setFriendId(user2.getUsersId());
		friendManager1.setFriendsNick(user2.getUserName());
		friendManager1.setSortFriend("同事");
		
		friendManager2.setUsersId(user2.getUsersId());
		friendManager2.setFriendId(user1.getUsersId());
		friendManager2.setFriendsNick(user1.getUserName());
		friendManager2.setSortFriend("同事");
		
		this.getSqlMapClientTemplate().insert("insertFriends", friendManager1);
		this.getSqlMapClientTemplate().insert("insertFriends", friendManager2);
		
	}
}
