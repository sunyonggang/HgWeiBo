package com.hgweibo.service;

import java.util.List;

import com.hgweibo.model.Care;
import com.hgweibo.model.PageList;
import com.hgweibo.model.User;

public interface CareService {
	
	public abstract void careService(Care care);
	
	public abstract List<User> careList(PageList page);
	
	public abstract Care checkCare(Care care);
	
	public abstract Care checkReCare(Care care);
	
}
