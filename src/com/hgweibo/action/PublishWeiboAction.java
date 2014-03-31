package com.hgweibo.action;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.apache.struts2.ServletActionContext;

import com.hgweibo.model.User;
import com.hgweibo.model.Weibo;
import com.hgweibo.service.WeiboService;


public class PublishWeiboAction extends BaseAction {

    private WeiboService weiboService;
	
	private static final long serialVersionUID = -2049915427653864513L;
	
	private Weibo weibo;
	
	
	public Weibo getWeibo() {
		return weibo;
	}


	public void setWeibo(Weibo weibo) {
		this.weibo = weibo;
	}


	public WeiboService getWeiboService() {
		return weiboService;
	}


	public void setWeiboService(WeiboService weiboService) {
		this.weiboService = weiboService;
	}



    /**
     * ∑¢≤ºŒ¢≤©action
     */
	public void publishWeibo(){
		
        try {
        	System.out.println("bianma kaishi ");
			weibo.setContents(URLDecoder.decode(weibo.getContents(), "utf-8"));
			weibo.setTheme(URLDecoder.decode(weibo.getTheme(), "utf-8"));
        } catch (UnsupportedEncodingException e) {
		}
        
        
		weiboService.publishWeibo(weibo);
		this.ajaxPrintPage(this.AJAX_SUCCESS);
	}
	/**
	 * ∆¿¬€Œ¢≤©action
	 */
	
	public void submitComment(){
	    User user =(User) ServletActionContext.getRequest().getSession().getAttribute("user");
		
	    try {
			weibo.setCommentContent(URLDecoder.decode(this.weibo.getCommentContent(), "UTF-8"));
		    weibo.setUsersId(user.getUsersId());
		    weiboService.commentWeibo(this.weibo);
			this.ajaxPrintPage(this.AJAX_SUCCESS);
		} catch (Exception e) {
			
			this.ajaxPrintPage(this.AJAX_FAILED);
		}
		
	}
	
	public void submitRefend(){
		User user =(User) ServletActionContext.getRequest().getSession().getAttribute("user");
		
		try {
			weibo.setUsersId(user.getUsersId());
			weibo.setForewardCount(this.weibo.getForewardCount()+1);
			weiboService.refend(weibo);
			this.ajaxPrintPage(this.AJAX_SUCCESS);
		} catch (Exception e) {
			
			this.ajaxPrintPage(this.AJAX_FAILED);
		}
	}
}
