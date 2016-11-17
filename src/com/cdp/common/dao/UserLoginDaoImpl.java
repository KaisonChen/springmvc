package com.cdp.common.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("UserLoginDao")
public class UserLoginDaoImpl implements UserLoginDao {

	
	@Autowired 
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public String userLogin(String username, String userpwd) {
		
		System.out.println(username);
		return null;
	}

}
