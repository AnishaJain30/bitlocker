package com.trade.repository;

import org.springframework.data.repository.CrudRepository;

import com.trade.bean.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
