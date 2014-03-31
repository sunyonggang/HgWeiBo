package com.hgweibo.model;

public class Message
{
	private Integer usersId;
	private Integer receivedUserid;
	private String info;
	private Integer isRead;
	private String sendDate;
	
	public String getInfo()
	{
		return info;
	}
	public void setInfo(String info)
	{
		this.info = info;
		
	}
	public Integer getUsersId() {
		return usersId;
	}
	public void setUsersId(Integer usersId) {
		this.usersId = usersId;
	}
	public Integer getReceivedUserid() {
		return receivedUserid;
	}
	public void setReceivedUserid(Integer receivedUserid) {
		this.receivedUserid = receivedUserid;
	}
	public Integer getIsRead() {
		return isRead;
	}
	public void setIsRead(Integer isRead) {
		this.isRead = isRead;
	}
	public String getSendDate() {
		return sendDate;
	}
	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}
	
}
