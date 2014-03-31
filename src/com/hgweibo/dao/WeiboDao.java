package com.hgweibo.dao;

import java.util.List;

import com.hgweibo.model.Weibo;

public interface WeiboDao {
	
	public Weibo findWeibo(Weibo weibo);
	
	public List<Weibo> findWeiboList(Weibo weibo);
	
	public void deleteWeibo(Weibo weibo);
	
	public void insertWeibo(Weibo weibo);

	public void insertComment(Weibo weibo);

	public void updateWeiboCommentCount(Weibo weibo);

	public void insertRefend(Weibo weibo);
	
}
