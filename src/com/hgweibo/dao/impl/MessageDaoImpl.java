package com.hgweibo.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.hgweibo.dao.MessageDao;
import com.hgweibo.model.Message;

public class MessageDaoImpl extends SqlMapClientDaoSupport implements MessageDao
{

	@Override
	public void addMessage(Message message)
	{
		System.out.println("MessageDaoImpl is involked");
		
		this.getSqlMapClientTemplate().insert("addMessage", message);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Message> findByReceivedUserId(Message message)
	{
		System.out.println("findByReceivedUserId involked");
		return (List<Message>)this.getSqlMapClientTemplate().queryForList("findMessage", message);
	}
	
}
