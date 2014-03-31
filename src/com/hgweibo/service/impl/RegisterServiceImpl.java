package com.hgweibo.service.impl;

import com.hgweibo.dao.RegisterDao;
import com.hgweibo.model.User;
import com.hgweibo.service.RegisterService;

public class RegisterServiceImpl implements RegisterService {

	private RegisterDao registerDao;
	
	public void registerService(User user) {
		// TODO Auto-generated method stub
		registerDao.addUser("addUser", user);
	}

	public RegisterDao getRegisterDao() {
		return registerDao;
	}

	public void setRegisterDao(RegisterDao registerDao) {
		this.registerDao = registerDao;
	}

	@Override
	public User checkUserIsExit(User user) {
		return registerDao.findUserByName("checkUser", user);
	}

}
