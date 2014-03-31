package com.hgweibo.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.hgweibo.model.FriendManager;
import com.hgweibo.model.PageList;
import com.hgweibo.model.User;
import com.hgweibo.model.WeiboShow;
import com.hgweibo.service.CareService;
import com.hgweibo.service.FriendManagerService;
import com.hgweibo.service.LoginService;

public class LoginAction {
	private User user;
	private LoginService loginService;
	private String loginerror;
	private FriendManager friendManager;
	private FriendManagerService friendManagerService;
	
	private List<FriendManager> friendlists;
	private List<User> carelists;
	private List<User> hotCares;
	private List<WeiboShow> weiboList;
	
	
	private List<FriendManager> friendlists1;
	private List<FriendManager> friendlists2;
	
    
	private CareService careService;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	public String login() {
		if (user.getUserName() == "" || user.getPassword() == "") {
			loginerror = "用户名或密码错误";
			ServletActionContext.getRequest().getSession().setAttribute("loginerror",loginerror );
			return "fail";
		} else {
			User user = loginService.loginService(this.user);
			if (user != null) {
				this.user = user;
				friendlists = friendManagerService.getFriends(user);
				friendlists1 = new ArrayList<FriendManager>();
				friendlists2 = new ArrayList<FriendManager>();
				for (Iterator iterator = friendlists.iterator(); iterator
						.hasNext();) {
					FriendManager type = (FriendManager) iterator.next();
					if (type.getSortFriend().equals("同事")) {
						friendlists1.add(type);
					}else {
						friendlists2.add(type);
					}
					
				}
				PageList pageList = new PageList();
				pageList.setPageIndex(2);
				pageList.setPageSize(5);
				hotCares = careService.careList(pageList);
				weiboList = loginService.getWeibos(this.user);
				/*for (Iterator iterator = hotCares.iterator(); iterator
						.hasNext();) {
					User type = (User) iterator.next();
					System.out.println(type.getUsersId());
					System.out.println(type.getUserName());
					System.out.println(type.getCareCount());
					
				}*/
				//System.out.println(cs);
				/*for (Iterator friends = lists.iterator(); friends.hasNext();) {
					FriendManager type = (FriendManager) friends.next();
					System.out.println(type.getListId());
					System.out.println(type.getUsersId());
					System.out.println(type.getSortFriend());
				}*/
				ServletActionContext.getRequest().getSession().setAttribute("hotCares", hotCares);
				ServletActionContext.getRequest().getSession().setAttribute("friendlist1", friendlists1);
				ServletActionContext.getRequest().getSession().setAttribute("friendlist2", friendlists2);
				ServletActionContext.getRequest().getSession().setAttribute("user", user);
				return "success";
			} else {
				loginerror = "用户名或密码错误";
				ServletActionContext.getRequest().getSession().setAttribute("loginerror",loginerror );
				return "fail";
			}
		}
	}

	public String getLoginerror() {
		return loginerror;
	}

	public void setLoginerror(String loginerror) {
		this.loginerror = loginerror;
	}

	public FriendManager getFriendManager() {
		return friendManager;
	}

	public void setFriendManager(FriendManager friendManager) {
		this.friendManager = friendManager;
	}

	public FriendManagerService getFriendManagerService() {
		return friendManagerService;
	}

	public void setFriendManagerService(FriendManagerService friendManagerService) {
		this.friendManagerService = friendManagerService;
	}

	public List<FriendManager> getFriendlists() {
		return friendlists;
	}

	public void setFriendlists(List<FriendManager> friendlists) {
		this.friendlists = friendlists;
	}

	public List<User> getCarelists() {
		return carelists;
	}

	public void setCarelists(List<User> carelists) {
		this.carelists = carelists;
	}

	public List<User> getHotCares() {
		return hotCares;
	}

	public void setHotCares(List<User> hotCares) {
		this.hotCares = hotCares;
	}

	public CareService getCareService() {
		return careService;
	}

	public void setCareService(CareService careService) {
		this.careService = careService;
	}

	public List<WeiboShow> getWeiboList() {
		return weiboList;
	}

	public void setWeiboList(List<WeiboShow> weiboList) {
		this.weiboList = weiboList;
	}

	public List<FriendManager> getFriendlists1() {
		return friendlists1;
	}

	public void setFriendlists1(List<FriendManager> friendlists1) {
		this.friendlists1 = friendlists1;
	}

	public List<FriendManager> getFriendlists2() {
		return friendlists2;
	}

	public void setFriendlists2(List<FriendManager> friendlists2) {
		this.friendlists2 = friendlists2;
	}
	
}
