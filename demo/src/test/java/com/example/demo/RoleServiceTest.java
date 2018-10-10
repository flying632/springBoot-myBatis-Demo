package com.example.demo;

import com.example.demo.entity.Role;
import com.example.demo.service.RoleService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RoleServiceTest {
    @Autowired
    private RoleService userService;
    @Test
    public void selectUserByIdTest(){
        Role user = userService.selectRoleById(1);
        System.out.println("查找结果" + user.getRole_name());
    }


}
