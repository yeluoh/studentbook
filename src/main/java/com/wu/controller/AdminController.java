package com.wu.controller;

import com.wu.pojo.Admin;
import com.wu.service.AdminService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class AdminController {
    @Autowired
    AdminService adminService;
    @RequestMapping("/login")
    public String login(String name,String password, HttpSession session,Model model,HttpServletRequest request, HttpServletResponse response)throws Exception{
        Admin admin = adminService.getAdmin(name,password);
        if (admin != null){
            //登录成功
            return "allbook";
        }else {
            //登录失败
            return "frame";
        }

    }
}