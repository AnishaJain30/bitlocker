package com.trade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trade.bean.User;
import com.trade.repository.UserRepository;

@Service
@Transactional
public class UserServiceImp implements UserService {
	@Autowired
	private UserRepository userRepository;

	public void createUser(User user) {
		userRepository.save(user);
	}

	public List<User> getUser() {
		return (List<User>) userRepository.findAll();
	}

	public User findById(long id) {
		return userRepository.findOne(id);
	}

	public User update(User user, long l) {
		return userRepository.save(user);
	}

	public void deleteUserById(long id) {
		userRepository.delete(id);
	}

	@Override
	public User signIn(String userName, String password) {
		return userRepository.SignIn(userName, password);
	}

}
