package com.ssd.service;

import com.ssd.user.UserDao;
import com.ssd.user.UserDto;

public class UserService {

	UserDao dao;
	
	public UserService() {
		
		dao=new UserDao();
	}
	
	public boolean userCreated(UserDto user) {
		
		return dao.userCreated(user);
	
	}
	
	public UserDto getUser(String email, String pswd) {
		
		return dao.getUser(email, pswd);
	}
	
}
