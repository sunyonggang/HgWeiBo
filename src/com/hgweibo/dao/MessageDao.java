package com.hgweibo.dao;

import java.util.List;

import com.hgweibo.model.Message;

public interface MessageDao
{
	public void addMessage(Message message);
	public List<Message> findByReceivedUserId(Message message);
}
