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
	
	
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	

}
