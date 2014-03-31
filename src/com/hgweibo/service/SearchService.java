package com.hgweibo.service;


import java.util.List;

import com.hgweibo.model.User;
import com.hgweibo.model.Weibo;

public interface SearchService {
	public List<Weibo> searchService(String theme);
	
	public List<User> searchUsersService(String name);
	
}
