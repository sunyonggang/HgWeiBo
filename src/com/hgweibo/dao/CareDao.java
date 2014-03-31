package com.hgweibo.dao;

import java.util.List;

import com.hgweibo.model.Care;
import com.hgweibo.model.PageList;
import com.hgweibo.model.User;

public interface CareDao {

	public void insertCsre(String queryString,Care care);
	public abstract List<User> careList(String queryString,PageList page);
	public abstract Care checkCare(String queryString,Care care);
}
