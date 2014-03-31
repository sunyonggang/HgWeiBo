package com.hgweibo.dao.impl;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.hgweibo.dao.RegisterDao;
import com.hgweibo.model.User;

public class RegisterDaoImpl extends SqlMapClientDaoSupport implements RegisterDao {

	public void addUser(String querysString,User user) {
		// TODO Auto-generated method stub
		this.getSqlMapClientTemplate().insert(querysString, user);
	}

	public User findUserByName(String queryString, User user) {
		// TODO Auto-generated method stub
		return (User)this.getSqlMapClientTemplate().queryForObject(queryString, user);
	}

}
