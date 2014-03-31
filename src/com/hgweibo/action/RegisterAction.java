package com.hgweibo.action;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import com.hgweibo.model.User;
import com.hgweibo.service.RegisterService;

public class RegisterAction extends BaseAction {

	private static final long serialVersionUID = -434967329672749906L;
	private User user;
	private RegisterService registerService;
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String register() {
		
		System.out.println(user.getUserName());
		System.out.println(user.getNick());
		System.out.println(user.getQq());
		
		if (user.getUserName()=="") {
			return "fail";
		}
		else {
			System.out.println("user");
			registerService.registerService(user);
			
			return "success";
		}
	}
    
	public void checkUser(){
		try {
			user.setUserName(URLDecoder.decode(this.user.getUserName(), "utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (registerService.checkUserIsExit(user)==null) {
			ajaxPrintPage(this.AJAX_SUCCESS);
		}else {
			ajaxPrintPage(this.AJAX_FAILED);
		}
	}
	
	public RegisterService getRegisterService() {
		return registerService;
	}

	public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
	}
	
}
