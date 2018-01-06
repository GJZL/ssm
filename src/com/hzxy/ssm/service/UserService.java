package com.hzxy.ssm.service;

import com.hzxy.ssm.pojo.User;

public interface UserService {

	User loginUser(String username,String password);
}
