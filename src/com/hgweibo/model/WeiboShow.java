package com.hgweibo.model;

public class WeiboShow {
	private Integer usersId;
	private String userName;
	private Integer weiboId;
	
	private String contents;
	private String publishDate;
	private Integer forewardCount;
	private Integer comentCount;
	private String theme;
	
	private String info;
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public Integer getForewardCount() {
		return forewardCount;
	}
	public void setForewardCount(Integer forewardCount) {
		this.forewardCount = forewardCount;
	}
	public Integer getComentCount() {
		return comentCount;
	}
	public void setComentCount(Integer comentCount) {
		this.comentCount = comentCount;
	}
	public Integer getWeiboId() {
		return weiboId;
	}
	public void setWeiboId(Integer weiboId) {
		this.weiboId = weiboId;
	}
	public Integer getUsersId() {
		return usersId;
	}
	public void setUsersId(Integer usersId) {
		this.usersId = usersId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
}
