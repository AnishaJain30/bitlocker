package com.trade.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.trade.bean.User;

public interface UserRepository extends CrudRepository<User, Long> {

	@Query("select u from User u where u.username=?1 and password=?2")
	User SignIn(String username, String password);
}
