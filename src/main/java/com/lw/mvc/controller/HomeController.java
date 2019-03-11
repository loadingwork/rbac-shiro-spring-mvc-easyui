package com.lw.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主页控制器
 * @author root
 *
 */
@Controller
public class HomeController {
	
	
	
	/**
	 * 主页
	 * @return
	 */
	@RequestMapping("/")
	public String index() {
		return "/index";
	}
	
	
	/**
	 * 没有授权显示的页面
	 * @return
	 */
	@RequestMapping("/unauthorized.do")
	public String unauthorized() {
		return "/unauthorized";
	}
	
	
	@RequestMapping("/home.do")
	public String home() {
		return "/home/index";
	}
	
	
	
	

}
