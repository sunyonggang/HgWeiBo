package com.hgweibo.service.impl;

import java.util.List;

import com.hgweibo.dao.WeiboDao;
import com.hgweibo.model.Weibo;
import com.hgweibo.service.WeiboService;

public class WeiboServiceImpl implements WeiboService{

	private WeiboDao weiboDao;
	
	public void deleteWeibo(Weibo weibo) {
		
		
	}

	@Override
	public List<Weibo> getListWeibo(Weibo weibo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Weibo getWeiboBy(Weibo weibo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void publishWeibo(Weibo weibo) {
		weiboDao.insertWeibo(weibo);
		
	}
	
	public void commentWeibo(Weibo weibo) {
		weiboDao.insertComment(weibo);
		
	}
	public WeiboDao getWeiboDao() {
		return weiboDao;
	}

	public void setWeiboDao(WeiboDao weiboDao) {
		this.weiboDao = weiboDao;
	}

	@Override
	public void updateWeiboComentCount(Weibo weibo) {
		weiboDao.updateWeiboCommentCount(weibo);
		
	}

	@Override
	public void refend(Weibo weibo) {
		weiboDao.insertRefend(weibo);
		
	}

	

}
