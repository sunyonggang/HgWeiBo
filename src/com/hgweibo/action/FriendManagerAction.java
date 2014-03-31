package com.hgweibo.action;

public class FriendManagerAction extends BaseAction {

	private static final long serialVersionUID = 1223237842623150512L;
	
	private String friendString;
	
	public void friend(){
		this.ajaxPrintPage("");
	}

	public String getFriendString() {
		return friendString;
	}

	public void setFriendString(String friendString) {
		this.friendString = friendString;
	}
	
	
}
