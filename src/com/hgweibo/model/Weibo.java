package com.hgweibo.model;

public class Weibo {
	
	private Integer weiboId;
	private Integer usersId;
	private String contents;
	private String theme;
	private Integer forewardCount;
	private Integer comentCount;
	private String publishDate;
	private String commentContent;
	
	private String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
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
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	
}
