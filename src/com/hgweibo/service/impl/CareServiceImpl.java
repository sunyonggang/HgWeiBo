package com.hgweibo.service.impl;

import java.util.List;

import com.hgweibo.dao.CareDao;
import com.hgweibo.model.Care;
import com.hgweibo.model.PageList;
import com.hgweibo.model.User;
import com.hgweibo.service.CareService;

public class CareServiceImpl implements CareService {

	private CareDao careDao;

	public void careService(Care care) {
		// TODO Auto-generated method stub
		careDao.insertCsre("addCare", care);
	}

	public CareDao getCareDao() {
		return careDao;
	}

	public void setCareDao(CareDao careDao) {
		this.careDao = careDao;
	}

	public List<User> careList(PageList page) {
		// TODO Auto-generated method stub
		System.out.println("CareServiceImpl.careList()");
		return careDao.careList("hotCare", page);
	}

	@Override
	public Care checkCare(Care care) {
		// TODO Auto-generated method stub
		return careDao.checkCare("checkCare", care);
	}

	@Override
	public Care checkReCare(Care care) {
		// TODO Auto-generated method stub
		return careDao.checkCare("checkReCare", care);
	}

}
