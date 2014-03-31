package com.hgweibo.dao.impl;


import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.hgweibo.dao.SearchDao;
import com.hgweibo.model.User;
import com.hgweibo.model.Weibo;

public class SearchDaoImpl extends SqlMapClientDaoSupport implements SearchDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Weibo> findWeibos(String queryString,String theme) {
		// TODO Auto-generated method stub
		return (List<Weibo>)this.getSqlMapClientTemplate().queryForList(queryString,theme);
	}

	@SuppressWarnings("unchecked")
	public List<User> searchUsers(String queryString, String name) {
		// TODO Auto-generated method stub
		return (List<User>)this.getSqlMapClientTemplate().queryForList(queryString, name);
	}

}
