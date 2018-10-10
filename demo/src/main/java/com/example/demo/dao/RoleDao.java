package com.example.demo.dao;

import com.example.demo.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
public interface RoleDao {
    /**
     * 新增
     */
    public int insertRole(Role role);
    /**
     * 查询
     */
    public Role selectRoleById(int id);
    /**
     * 查询所有
     */
    public List<Role> selectAllRoles();
}
