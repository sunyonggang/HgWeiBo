package com.hgweibo.dao;

import java.util.List;

import com.hgweibo.model.User;
import com.hgweibo.model.WeiboShow;

public interface LoginDao {
	
    public User findUserByName(String queryString,User user);

    public void addUser(User user);
    
    public List<WeiboShow> findWeibos(User user);
}
