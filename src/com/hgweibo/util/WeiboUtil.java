package com.hgweibo.util;

import com.hgweibo.model.Weibo;

public class WeiboUtil {
	
	
	public static Weibo splitWeiboInfo(Weibo weibo,String weiboInfo,Integer usersId){
		/*try {
			//URLDecoder.decode(weiboInfo, "utf-8");
		} catch (UnsupportedEncodingException e) {
		}*/
		System.out.println(weiboInfo==null);
		System.out.println(weiboInfo);
		System.out.println(usersId);
		String[] temps= weiboInfo.split("\\#");
		weibo.setTheme(temps[1]);
		weibo.setContents(temps[2]);
		weibo.setUsersId(usersId);
		return weibo;
	}
    
}
