package com.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserDao UserDao ;

	public int save(User user) {
		return UserDao.save(user);
	}

	public List getAllUser() {
		return UserDao.getAllUser();
	}

	/*
	 * public List getAllBooks(){ return bookDao.getAllBooks(); }
	 */
	public User getSingleId(int id) {
		return UserDao.getSingleId(id);
	}

	public int updateProduct(User user) {
		return UserDao.updateUser(user);
	}

	public int deleteProduct(int id) {
		return UserDao.deleteProduct(id);
	}
}
