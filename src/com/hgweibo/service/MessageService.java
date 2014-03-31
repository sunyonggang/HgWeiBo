package com.hgweibo.service;

import java.util.List;

import com.hgweibo.model.Message;

public interface MessageService
{
	public void sendService(Message message);
	public List<Message> getMessageService(Message message);
}
