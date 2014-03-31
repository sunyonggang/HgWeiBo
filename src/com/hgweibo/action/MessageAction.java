package com.hgweibo.action;

import org.apache.struts2.ServletActionContext;

import com.hgweibo.model.Message;
import com.hgweibo.model.User;
import com.hgweibo.service.MessageService;

public class MessageAction
{
	private Message message;
	private MessageService messageService;
	
	public Message getMessage()
	{
		return message;
	}
	public void setMessage(Message message)
	{
		this.message = message;
	}
	public MessageService getMessageService()
	{
		return messageService;
	}
	public void setMessageService(MessageService messageService)
	{
		this.messageService = messageService;
	}
	
	public String messageSend()
	{
		User user =(User) ServletActionContext.getRequest().getSession().getAttribute("user");
		message.setUsersId(user.getUsersId());
		System.out.println("MessageAction involked");
		System.out.println(message.getUsersId());
		System.out.println(message.getReceivedUserid());
		System.out.println(message.getInfo());
		messageService.sendService(message);
		return "success";
	}
}
