package com.sonia.org.service;

import com.sonia.org.domain.Admin;

import java.util.List;

public interface AdminService extends IService<Admin,String>
{
    List<Admin> getAll();
}