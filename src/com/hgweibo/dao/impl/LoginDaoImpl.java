package com.hgweibo.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.hgweibo.dao.LoginDao;
import com.hgweibo.model.User;
import com.hgweibo.model.WeiboShow;

public class LoginDaoImpl extends SqlMapClientDaoSupport implements LoginDao {

	@Override
	
	public User findUserByName(String queryString ,User user) {
	   return (User)this.getSqlMapClientTemplate().queryForObject(queryString, user);
	}

	@Override
	public void addUser(User user) {
	this.getSqlMapClientTemplate().insert("addUser", user);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<WeiboShow> findWeibos(User user) {
		// TODO Auto-generated method stub
		return (List<WeiboShow>)this.getSqlMapClientTemplate().queryForList("findWeibos",user );
	}

}
