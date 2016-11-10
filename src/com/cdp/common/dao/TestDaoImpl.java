package com.cdp.common.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

@Repository("TestDao")
public class TestDaoImpl implements TestDao {


	@Autowired 
	private JdbcTemplate jdbcTemplate;
	@Override
	public String testDao() {
		String str= "";
		String sql ="select account from manager";
		SqlRowSet rs = jdbcTemplate.queryForRowSet(sql);
		while(rs.next()){
			str= rs.getString(1);
		}
		System.out.println(str);
		return "hello springmvc";
	}

}
