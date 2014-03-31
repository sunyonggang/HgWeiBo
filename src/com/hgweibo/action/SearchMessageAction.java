package com.hgweibo.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.hgweibo.model.Message;
import com.hgweibo.model.User;
import com.hgweibo.service.MessageService;

public class SearchMessageAction
{
	private Message message;
	private MessageService messageService;
	private List<Message> m;
	
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
	
	public String getSearchMessage()
	{
		System.out.println(((User)ServletActionContext.getRequest().getSession().getAttribute("user")).getUsersId());
		Message	message = new Message();
		message.setReceivedUserid(((User)ServletActionContext.getRequest().getSession().getAttribute("user")).getUsersId());
		 m = messageService.getMessageService(message);
		if (m != null)
		{
			return "success";
		}
		else
		{
			return "fail";
		}
	}
	public List<Message> getM() {
		return m;
	}
	public void setM(List<Message> m) {
		this.m = m;
	}
	
}
