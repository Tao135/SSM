package com.itheima.service;

import com.itheima.pojo.Role;

import java.util.List;

public interface RoleService {
    List<Role> list();

    void save(Role role);
}
