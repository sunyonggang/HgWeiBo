package com.hgweibo.service.impl;

import java.util.List;

import com.hgweibo.dao.MessageDao;
import com.hgweibo.model.Message;
import com.hgweibo.service.MessageService;

public class MessageServiceImpl implements MessageService
{
	private MessageDao messageDao;
	
	
	
	public MessageDao getMessageDao()
	{
		return messageDao;
	}



	public void setMessageDao(MessageDao messageDao)
	{
		this.messageDao = messageDao;
	}



	@Override
	public void sendService(Message message)
	{
		System.out.println("MessageServiceImpl involked");
		messageDao.addMessage(message);

	}



	@Override
	public List<Message> getMessageService(Message message)
	{
		List<Message> newMessage = messageDao.findByReceivedUserId(message);
		/*for (Iterator iterator = newMessage.iterator(); iterator.hasNext();)
		{
			Message m = (Message) iterator.next();
			System.out.println(m.getInfo());
			
		}*/
		return newMessage;
	}

}
