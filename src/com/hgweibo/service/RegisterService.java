package com.hgweibo.service;

import com.hgweibo.model.User;

public interface RegisterService {

	public void registerService(User user);
	public User checkUserIsExit(User user);
}
