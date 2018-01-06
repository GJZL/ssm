package com.hzxy.ssm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hzxy.ssm.pojo.User;
import com.hzxy.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String userLogin(String username,String password,HttpSession session,ModelMap modelMap) {
		User user = userService.loginUser(username, password);
		if (user!=null) {
			session.setAttribute("user", user);
			return "index";
		}
		modelMap.addAttribute("error", "用户名或密码输入错误！");
		return "login";
	}
}
