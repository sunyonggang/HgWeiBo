package com.hgweibo.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.hgweibo.dao.WeiboDao;
import com.hgweibo.model.Weibo;

public class WeiboDaoImpl extends SqlMapClientDaoSupport implements WeiboDao{

	@Override
	public void deleteWeibo(Weibo weibo) {
		
		
	}

	@Override
	public Weibo findWeibo(Weibo weibo) {
		return 	(Weibo)this.getSqlMapClientTemplate().queryForObject("findWeiboBy", weibo);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Weibo> findWeiboList(Weibo weibo) {
		return (List<Weibo>)this.getSqlMapClientTemplate().queryForList("findWeibos",weibo);

	}

	@Override
	public void insertWeibo(Weibo weibo) {
		this.getSqlMapClientTemplate().insert("addWeibo", weibo);
	}

	@Override
	public void insertComment(Weibo weibo) {
		this.getSqlMapClientTemplate().insert("addComment", weibo);
		Weibo weibo1 = (Weibo) this.getSqlMapClientTemplate().queryForObject("findWeiboById", weibo);
		weibo1.setComentCount(weibo.getComentCount()+1);
		this.getSqlMapClientTemplate().update("updateCommentCount", weibo1);
	  
	}

	@Override
	public void updateWeiboCommentCount(Weibo weibo) {
		this.getSqlMapClientTemplate().update("updateComentCount", weibo);
	}

	@Override
	public void insertRefend(Weibo weibo) {
		this.getSqlMapClientTemplate().insert("addRefend", weibo);
		
		this.getSqlMapClientTemplate().update("updateRefendCount", weibo);
		  
		
	}
}
