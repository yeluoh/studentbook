package com.wu.service.Impl;

import com.wu.mapper.AdminMapper;
import com.wu.pojo.Admin;
import com.wu.service.AdminService;
import com.wu.service.Impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;


    @Override
    public Admin getAdmin(String name, String password) {
        return adminMapper.getAdmin(name,password);
    }

    @Override
    public Admin findAdminBynameAndPassword(String name, String password) {
        Admin adminBynameAndPassword = adminMapper.findAdminBynameAndPassword(name, password);
        if (adminBynameAndPassword != null){
            return adminBynameAndPassword;
        }
        return null;
    }

    @Override
    public Admin login(String name) {
        Admin admin = adminMapper.login(name);
        if (admin != null)
            admin.setPassword(name);

        return adminMapper.login(name);
    }

    @Override
    public Admin findAdminById(Integer id) {
        Admin admin = adminMapper.findAdminById(id);
        if (admin != null){
            return admin;
        }
        return null;
    }


    @Override
    public Admin findByname(String name) {
        return adminMapper.findByname(name);
    }
    @Override
    public void addAdmin(Admin admin) throws Exception {
        adminMapper.addAdmin(admin);
    }

    @Override
    public void getAdminList(String name, String password) {
        adminMapper.getAdminList(name,password);
    }
}
