package com.hgweibo.service;

import java.util.List;

import com.hgweibo.model.User;
import com.hgweibo.model.WeiboShow;

public interface LoginService {
	
	public User loginService(User user);
	public boolean checkService();
	public void registerService(User user);
	public List<WeiboShow> getWeibos(User user);

}
