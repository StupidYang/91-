package com.ncu.iqiyi.service;

import com.ncu.iqiyi.entity.User;

public interface UserService {
    User findByUserName(String username);
    void register(String username, String password);
}
