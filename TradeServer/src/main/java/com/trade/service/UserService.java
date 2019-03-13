package com.trade.service;

import java.util.List;

import com.trade.bean.User;

public interface UserService {
	public void createUser(User user);

	public List<User> getUser();

	public User findById(long id);

	public User update(User user, long l);

	public void deleteUserById(long id);

	public User signIn(String userName, String password);
}
