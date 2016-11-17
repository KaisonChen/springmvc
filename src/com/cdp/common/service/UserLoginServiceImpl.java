package com.cdp.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdp.common.dao.UserLoginDao;

@Service("UserLoginService")
public class UserLoginServiceImpl implements UserLoginService {
	
	@Autowired
	private UserLoginDao userLoginDao;

	@Override
	public String userLogin(String username,String userpwd) {
		
		userLoginDao.userLogin(username, userpwd);
		
		return null;
	}

}
