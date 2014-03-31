package com.hgweibo.service.impl;

import java.util.List;

import com.hgweibo.dao.SearchDao;
import com.hgweibo.model.User;
import com.hgweibo.model.Weibo;
import com.hgweibo.service.SearchService;

public class SearchServiceImpl implements SearchService {
     private SearchDao searchDao;
	@Override
	public List<Weibo> searchService(String theme) {
		// TODO Auto-generated method stub
		return searchDao.findWeibos("findWeibo1",theme);
	}
	public SearchDao getSearchDao() {
		return searchDao;
	}
	public void setSearchDao(SearchDao searchDao) {
		this.searchDao = searchDao;
	}
	@Override
	public List<User> searchUsersService(String name) {
		// TODO Auto-generated method stub
		return searchDao.searchUsers("searchUsers", name);
	}
  
}
