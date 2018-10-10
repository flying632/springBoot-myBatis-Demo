package com.example.demo.controller;

import com.example.demo.entity.Role;
import com.example.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/")
    public String home(){
        return "Hello world!!!";
    }

    @RequestMapping(value={"/sayHello","/sayHi"},method = RequestMethod.GET)
    public String sayHello(){
        Role role;
        String name = "";
        try {
            role = roleService.selectRoleById(1);
            name = role.getRole_name();
        }catch (Exception e){
            e.printStackTrace();
        }
        return "Hello World!!!"+ name;
    }
}
