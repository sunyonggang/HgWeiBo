package com.hgweibo.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.hgweibo.dao.CareDao;
import com.hgweibo.model.Care;
import com.hgweibo.model.PageList;
import com.hgweibo.model.User;

public class CareDaoImpl extends SqlMapClientDaoSupport implements CareDao {

	public void insertCsre(String queryString, Care care) {
		// TODO Auto-generated method stub
		this.getSqlMapClientTemplate().insert(queryString, care);
		User user = (User)this.getSqlMapClientTemplate().queryForObject("cfrfind", care);
		user.setCareCount(user.getCareCount()+1);
		this.getSqlMapClientTemplate().update("carecountupdateUser", user);
	}

	@SuppressWarnings("unchecked")
	public List<User> careList(String queryString, PageList page) {
		// TODO Auto-generated method stub
		return (List<User>)this.getSqlMapClientTemplate().queryForList(queryString,page);
	}

	public Care checkCare(String queryString, Care care) {
		// TODO Auto-generated method stub
		return (Care)this.getSqlMapClientTemplate().queryForObject(queryString, care);
	}

}
