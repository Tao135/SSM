package com.itheima.mapper;

import com.itheima.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    void saveUserRoleRel(Long id, Long[] roleIds);

    Long save(User user);

    void delUserRoleRel(Long userId);

    void del(Long userId);

    User findByUsernameAndPassword(String username, String password) throws Exception;
}
