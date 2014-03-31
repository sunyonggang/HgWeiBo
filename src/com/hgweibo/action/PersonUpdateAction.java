package com.hgweibo.action;

import java.util.List;

import com.hgweibo.model.FriendManager;
import com.hgweibo.model.PageList;
import com.hgweibo.model.User;
import com.hgweibo.model.WeiboShow;
import com.hgweibo.service.CareService;
import com.hgweibo.service.FriendManagerService;
import com.hgweibo.service.LoginService;
import com.hgweibo.service.PersonUpdateService;

public class PersonUpdateAction extends BaseAction {

	private static final long serialVersionUID = -5735540329489821116L;

	private User user;
	private List<FriendManager> friendlists;
	private List<User> hotCares;
	private List<WeiboShow> weiboList;
	
	private FriendManagerService friendManagerService;
	private CareService careService;
	private LoginService loginService;
    
	private PersonUpdateService personUpdateService;
	
	public String updatePersonInfo(){
		
		int temp = personUpdateService.personUpdataService(user);
		
		if (temp !=0) {
			friendlists = friendManagerService.getFriends(user);
			PageList pageList = new PageList();
			pageList.setPageIndex(2);
			pageList.setPageSize(5);
			hotCares = careService.careList(pageList);
			weiboList = loginService.getWeibos(this.user);
			return "success";
		}else{
		return "fail";
		}
	}
	
	public void checkUserIsExit(){
	       User users =	personUpdateService.checkUser(user);
	       if(users==null){
	    	   this.ajaxPrintPage("1");
	       }else{
	    	   this.ajaxPrintPage("0");
	       }
	    }
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public PersonUpdateService getPersonUpdateService() {
		return personUpdateService;
	}

	public void setPersonUpdateService(PersonUpdateService personUpdateService) {
		this.personUpdateService = personUpdateService;
	}

	public List<FriendManager> getFriendlists() {
		return friendlists;
	}

	public void setFriendlists(List<FriendManager> friendlists) {
		this.friendlists = friendlists;
	}

	public List<User> getHotCares() {
		return hotCares;
	}

	public void setHotCares(List<User> hotCares) {
		this.hotCares = hotCares;
	}

	public List<WeiboShow> getWeiboList() {
		return weiboList;
	}

	public void setWeiboList(List<WeiboShow> weiboList) {
		this.weiboList = weiboList;
	}

	public FriendManagerService getFriendManagerService() {
		return friendManagerService;
	}

	public void setFriendManagerService(FriendManagerService friendManagerService) {
		this.friendManagerService = friendManagerService;
	}

	public CareService getCareService() {
		return careService;
	}

	public void setCareService(CareService careService) {
		this.careService = careService;
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	

}
