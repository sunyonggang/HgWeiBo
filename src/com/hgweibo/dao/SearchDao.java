package com.hgweibo.dao;

import java.util.List;

import com.hgweibo.model.User;
import com.hgweibo.model.Weibo;

public interface SearchDao {
    public List<Weibo> findWeibos(String queryString,String theme);
    
    public List<User> searchUsers(String queryString,String name);
}
