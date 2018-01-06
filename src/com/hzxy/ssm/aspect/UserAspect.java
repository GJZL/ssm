package com.hzxy.ssm.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAspect {

	@Before(value="execution(* com.hzxy.ssm.dao.UserDao.loginUser(String, String))")
	public void beforeUserLogin() {
		System.out.println("用户来登录了！");
	}
	@After(value="execution(* com.hzxy.ssm.dao.UserDao.loginUser(String, String))")
	public void afterUserLogin() {
		System.out.println("用户登录完成！");
	}
}
