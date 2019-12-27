package com.ncu.iqiyi.service.impl;

import com.ncu.iqiyi.dao.UserDao;
import com.ncu.iqiyi.entity.User;
import com.ncu.iqiyi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User findByUserName(String username) {
        return userDao.findByUserName(username);
    }

    @Override
    public void register(String username, String password) {
        userDao.insert(username, password);
    }
}
