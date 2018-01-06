package com.hzxy.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzxy.ssm.dao.UserDao;
import com.hzxy.ssm.pojo.User;
import com.hzxy.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	@Override
	public User loginUser(String username, String password) {
		return userDao.loginUser(username, password);
	}

}
