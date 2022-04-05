package com.itheima.service.impl;

import com.itheima.mapper.RoleDao;
import com.itheima.pojo.Role;
import com.itheima.service.RoleService;

import java.util.List;

public class RoleServiceImpl implements RoleService {

    private RoleDao roleDao;

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public List<Role> list() {
        List<Role> roleList =  roleDao.findAll();
        return roleList;
    }

    public void save(Role role) {
        roleDao.save(role);
    }


}
