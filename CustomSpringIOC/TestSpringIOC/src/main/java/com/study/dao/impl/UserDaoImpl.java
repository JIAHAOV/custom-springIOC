package com.study.dao.impl;

import com.study.dao.UserDao;

public class UserDaoImpl implements UserDao {
    public UserDaoImpl() {
        System.out.println("userDao初始化");
    }

    @Override
    public void add() {
        System.out.println("UserDao的add方法被调用了");
    }

}
