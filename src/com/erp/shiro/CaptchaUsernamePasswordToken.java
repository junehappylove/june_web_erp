package com.erp.shiro;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * 类功能说明 密码以及验证码Token
 * 
 * @author wjw.happy.love@163.com
 * @date 2013-5-29 上午11:31:18
 * @version V1.0
 */

public class CaptchaUsernamePasswordToken extends UsernamePasswordToken {
	private static final long serialVersionUID = -3217596468830869181L;
	private String captcha;

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

	public CaptchaUsernamePasswordToken(String username, String password, boolean rememberMe, String host,
			String captcha) {
		super(username, password, rememberMe, host);
		this.captcha = captcha;
	}

	public CaptchaUsernamePasswordToken() {
		super();
	}
}
