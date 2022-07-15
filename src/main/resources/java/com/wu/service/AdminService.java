package com.wu.service;

import com.wu.pojo.Admin;

public interface AdminService {
    //用户登录
    public Admin login(String name,String password);
}
