package com.zhaofengyi.serviceImpl;

import com.zhaofengyi.dao.UsersMapper;
import com.zhaofengyi.pojo.Users;
import com.zhaofengyi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;


    @Override
    public void addT(Users users) {
        usersMapper.save(users);
    }

    @Override
    public List<Users> finAll() {
        return usersMapper.findAll();
    }

    @Override
    public void delT(Integer id) {

        usersMapper.deleteById(id);
    }


}
