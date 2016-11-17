package com.cdp.common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdp.common.service.UserLoginService;


@Controller
public class UserLoginController {
	
	@Autowired
	public UserLoginService userLoginService;

	@RequestMapping("/login-action")
	public String UserLogin(HttpServletRequest request, HttpServletResponse response,String username,String userpwd){
		
		userLoginService.userLogin(username, userpwd);
		return "user/login";
	}
}
