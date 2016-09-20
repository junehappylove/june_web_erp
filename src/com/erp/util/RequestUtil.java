package com.erp.util;

import javax.servlet.http.HttpServletRequest;

/**
 * 类功能说明 request工具类 
 * 
 * @author wjw.happy.love@163.com
 * @date 2013-4-19 下午03:18:05
 * @version V1.0
 */
public class RequestUtil {

	/**
	 * 获得请求路径
	 * 
	 * @param request
	 * @return
	 */
	public static String getRequestPath(HttpServletRequest request) {
		String requestPath = request.getRequestURI();
		requestPath = requestPath.substring(request.getContextPath().length());// 去掉项目路径
		return requestPath;
	}

}
