package com.ty.hospitalapp.controller;

import com.ty.hospitalapp.dao.UserDao;

public class TestDeleteUser {

	public static void main(String[] args) {

		UserDao userDao = new UserDao();
		userDao.deleteUser(1);
	}

}
