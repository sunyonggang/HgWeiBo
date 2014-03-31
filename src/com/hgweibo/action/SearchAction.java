package com.hgweibo.action;

import java.util.List;

import com.hgweibo.model.User;
import com.hgweibo.model.Weibo;
import com.hgweibo.service.SearchService;

public class SearchAction {
	private List<Weibo> weiboLsits;
	private List<User> userLists;
	private SearchService searchService;
	private String typeString;
	private String temp;
    private Weibo weibo;
    private User user;
    
	public String search()
	{   
		System.out.println(typeString);
		System.out.println(temp);
		 if (typeString == ""||temp == "") {
			return "fail";
		}else{
			if (typeString.equals("Ö÷Ìâ")) {
				weiboLsits = searchService.searchService(temp);
				/*for (Iterator iterator = weiboLsits.iterator(); iterator
						.hasNext();) {
					Weibo type = (Weibo) iterator.next();
					System.out.println(type.getContent());
				}*/
			}else{
				userLists  = searchService.searchUsersService(temp);
			}
			return "success";
		}
	}

	public List<User> getUserLists() {
		return userLists;
	}

	public void setUserLists(List<User> userLists) {
		this.userLists = userLists;
	}

	public List<Weibo> getWeiboLsits() {
		return weiboLsits;
	}

	public void setWeiboLsits(List<Weibo> weiboLsits) {
		this.weiboLsits = weiboLsits;
	}

	public SearchService getSearchService() {
		return searchService;
	}

	public void setSearchService(SearchService searchService) {
		this.searchService = searchService;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getTypeString() {
		return typeString;
	}

	public void setTypeString(String typeString) {
		this.typeString = typeString;
	}

	public Weibo getWeibo() {
		return weibo;
	}

	public void setWeibo(Weibo weibo) {
		this.weibo = weibo;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
