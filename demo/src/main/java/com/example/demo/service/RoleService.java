package com.example.demo.service;

import com.example.demo.entity.Role;

import com.example.demo.dao.RoleDao;
import com.example.demo.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role selectRoleById(Integer roleId) {
        return roleDao.selectRoleById(roleId);
    }
    public List<Role> selectAllRoles(){
        return roleDao.selectAllRoles();
    }
}