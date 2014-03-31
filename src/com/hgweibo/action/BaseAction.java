package com.hgweibo.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;



public abstract class BaseAction extends ActionSupport{

	private static final long serialVersionUID = -1802408614341288911L;
	public final String AJAX_SUCCESS = "1";
	public final String AJAX_FAILED = "0";
	/**
	 * ¥Ú”°µΩ“≥√Ê
	 * @param obj
	 */
	public void ajaxPrintPage(Object obj) {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("UTF-8");
		PrintWriter writer = null;
		try {
			try {
				writer = response.getWriter();
				if (null == obj)
					writer.print(obj);
				else
					writer.print(obj.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} finally {
			if (writer != null) {
				writer.flush();
				writer.close();
			}
		}
	}

}
