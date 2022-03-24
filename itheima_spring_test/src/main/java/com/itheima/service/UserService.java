package com.itheima.service;

import com.itheima.pojo.User;

import java.util.List;

public interface UserService {
    List<User> list();

    void save(User user, Long[] roleIds);

    void del(Long userId);
}
