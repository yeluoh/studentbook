package com.wu.mapper;

import com.wu.pojo.Admin;
import org.apache.ibatis.annotations.Param;

import java.sql.Connection;
import java.util.List;

public interface AdminMapper {

    public Admin findAdminBynameAndPassword(@Param("name")String name,@Param("password")String password);

    public Admin findAdminById(Integer id);

    public Admin login(String name);
    public Admin getAdmin(@Param("name")String name,@Param("password")String password);

    public Admin findByname(@Param("name")String name);

    public void   addAdmin(Admin admin);

    public void getAdminList(@Param("name")String name,@Param("password")String password);





}
