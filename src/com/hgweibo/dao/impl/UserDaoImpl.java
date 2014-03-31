package com.hgweibo.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.hgweibo.dao.UserDao;
import com.hgweibo.model.User;

public class UserDaoImpl extends SqlMapClientDaoSupport implements UserDao {

	@Override
	public void addUser(User user) {
		

	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User findUserByOption(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findUsers(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User user) {
		this.getSqlMapClientTemplate().update("updateUser", user);
	}

}
