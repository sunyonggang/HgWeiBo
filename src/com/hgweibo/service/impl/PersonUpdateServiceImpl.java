package com.hgweibo.service.impl;

import com.hgweibo.dao.PersonUpdateDao;
import com.hgweibo.model.User;
import com.hgweibo.service.PersonUpdateService;

public class PersonUpdateServiceImpl implements PersonUpdateService{

	private PersonUpdateDao personUpdateDao;
	
	public int personUpdataService(User user) {
		// TODO Auto-generated method stub
		return personUpdateDao.personUpdata("updateUser", user);
	}
	public PersonUpdateDao getPersonUpdateDao() {
		return personUpdateDao;
	}
	public void setPersonUpdateDao(PersonUpdateDao personUpdateDao) {
		this.personUpdateDao = personUpdateDao;
	}
	
	public User checkUser(User user) {
		// TODO Auto-generated method stub
		return personUpdateDao.checkUser("checkUser", user);
	}
	

}
