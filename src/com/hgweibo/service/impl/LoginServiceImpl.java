package com.hgweibo.service.impl;

import java.util.List;

import com.hgweibo.dao.LoginDao;
import com.hgweibo.model.User;
import com.hgweibo.model.WeiboShow;
import com.hgweibo.service.LoginService;

public class LoginServiceImpl implements LoginService{

	private LoginDao loginDao;
	@Override
	public User loginService(User user) {
		return loginDao.findUserByName("findUser", user);
		
	}

	@Override
	public boolean checkService() {
		// TODO Auto-generated method stub
		return false;
	}

	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	@Override
	public void registerService(User user) {
		loginDao.addUser(user);
		
	}

	@Override
	public List<WeiboShow> getWeibos(User user) {
		List<WeiboShow> list= loginDao.findWeibos(user);
		for(int i = 0;i<list.size();i++){
			WeiboShow weiboShow = list.get(i);
			weiboShow.setInfo("#"+weiboShow.getTheme()+"#"+weiboShow.getContents());
			list.set(i, weiboShow);
		}
		return list;
	}


	

}
