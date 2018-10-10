package com.example.demo.entity;

import org.mockito.internal.verification.Times;

import java.sql.Time;
import java.sql.Timestamp;

public class Role {


    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    public Long getDept_id() {
        return dept_id;
    }

    public void setDept_id(Long dept_id) {
        this.dept_id = dept_id;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    public Role(Long role_id, String role_name, String remark, Long dept_id, Timestamp create_time) {
        this.role_id = role_id;
        this.role_name = role_name;
        this.remark = remark;
        this.dept_id = dept_id;
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return "UserBean [role_id"+role_id+"] [role_name="+role_name+"]";
    }

    private Long role_id;
    private String role_name;
    private String remark;
    private Long dept_id;
    private Timestamp create_time;



}
