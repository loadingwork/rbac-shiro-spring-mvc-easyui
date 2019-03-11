package com.lw.mvc.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 登录控制器
 * @author root
 *
 */
@Controller
public class LoginController {
	
	
	/**
	 * 去登录页面
	 * @return
	 */
	@GetMapping("/login.do")
	public String toLogin() {
		
		Subject subject = SecurityUtils.getSubject();
		if (subject != null && subject.isAuthenticated()) {
//			已经去主页
			return "redirect:/home.do";
		}
		
		return "/login";
	}
	

}
