package com.wu.service;

import com.wu.pojo.Admin;

import java.util.List;

public interface AdminService {
     public Admin getAdmin(String name,String password);


     public Admin findAdminBynameAndPassword(String name,String password);
     public Admin login(String name);

     public Admin findAdminById(Integer id);

     public Admin findByname(String name);

     public void   addAdmin(Admin admin) throws Exception;

     public void getAdminList(String name,String password);



}
