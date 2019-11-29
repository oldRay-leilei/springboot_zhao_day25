package com.zhaofengyi.service;

import com.zhaofengyi.pojo.Users;

import java.util.List;

public interface UserService {

    void addT(Users users);

    List<Users> finAll();

    void delT(Integer id);
}
