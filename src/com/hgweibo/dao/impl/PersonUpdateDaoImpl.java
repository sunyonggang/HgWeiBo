package com.hgweibo.dao.impl;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.hgweibo.dao.PersonUpdateDao;
import com.hgweibo.model.User;

public class PersonUpdateDaoImpl extends SqlMapClientDaoSupport implements
		PersonUpdateDao {

	public int personUpdata(String querysString, User user) {
		// TODO Auto-generated method stub
		return (int)this.getSqlMapClientTemplate().update(querysString, user);
	}

	public User checkUser(String queryString, User user) {
		// TODO Auto-generated method stub
		return (User)this.getSqlMapClientTemplate().queryForObject(queryString, user);
	}

}
