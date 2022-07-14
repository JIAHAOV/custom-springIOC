package com.study.service.impl;

import com.study.dao.UserDao;
import com.study.service.UserService;

public class UserServiceImpl implements UserService {
    private String username;
    private UserDao userDao;

    public UserServiceImpl() {
        System.out.println("userService初始化");
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("UserService的add方法被调用了");
        userDao.add();
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "username='" + username + '\'' +
                ", userDao=" + userDao +
                '}';
    }
}
