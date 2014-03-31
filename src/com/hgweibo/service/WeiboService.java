package com.hgweibo.service;

import java.util.List;

import com.hgweibo.model.Weibo;

public interface WeiboService {
	public Weibo getWeiboBy(Weibo weibo);
	
	public void deleteWeibo(Weibo weibo);
	
	public List<Weibo> getListWeibo(Weibo weibo);
	
	public void publishWeibo(Weibo weibo);
	
	public void commentWeibo(Weibo weibo); 
	public void updateWeiboComentCount(Weibo weibo);

	public void refend(Weibo weibo);
}
