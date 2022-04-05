package com.itheima.mapper;

import com.itheima.domain.User;

import java.util.List;

public interface UserMapper {

    public List<User> findAll() throws Exception;

    public User findById(int id);
}
