package com.hgweibo.action;

import com.hgweibo.model.Care;
import com.hgweibo.service.CareService;
import com.hgweibo.service.FriendManagerService;

public class CareAction extends BaseAction{

	private static final long serialVersionUID = -465989552970886333L;
	
	private Care care;
	private CareService careService;
	private FriendManagerService friendManagerService;
	
	public void care(){
		
		System.out.println(care.getCareUserId());
		System.out.println(care.getUsersId());
		
		Care cares = careService.checkCare(care);
		System.out.println(cares);
		if (cares == null) {
			this.ajaxPrintPage("0");
			careService.careService(care);
			Care carere = careService.checkReCare(care);
			if (carere != null) {
				friendManagerService.insertCareToFriend(care);
			}
			
		}else{
			
			this.ajaxPrintPage("1");
		}
	}

	public Care getCare() {
		return care;
	}

	public void setCare(Care care) {
		this.care = care;
	}

	public CareService getCareService() {
		return careService;
	}

	public void setCareService(CareService careService) {
		this.careService = careService;
	}

	public FriendManagerService getFriendManagerService() {
		return friendManagerService;
	}

	public void setFriendManagerService(FriendManagerService friendManagerService) {
		this.friendManagerService = friendManagerService;
	}

}
