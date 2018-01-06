package com.hzxy.ssm.dao;

import org.apache.ibatis.annotations.Param;

import com.hzxy.ssm.pojo.User;

public interface UserDao {

	User loginUser(@Param("username")String username,@Param("password")String password);
}
