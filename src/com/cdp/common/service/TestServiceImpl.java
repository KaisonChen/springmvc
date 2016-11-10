package com.cdp.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdp.common.dao.TestDao;

@Service("TestService")
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDao testDao;
	
	
	@Override
	public String testService() {
		String str = testDao.testDao();
		return null;
	}

}
