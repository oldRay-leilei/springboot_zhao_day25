package com.zhaofengyi.controller;

import com.zhaofengyi.pojo.Users;
import com.zhaofengyi.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "多的一方")
@RestController
@CrossOrigin
@RequestMapping(value = "/Users")
public class UsersController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = " 多的详情")
    @RequestMapping(value = "/usersList")
    public List<Users>  usersList(){
       return userService.finAll();
    }

    @RequestMapping(value = "addT")
    public boolean addT(Users users){
        try {
            userService.addT(users);
            return true;
        }catch (Exception e){

            return false;
        }
    }

    @RequestMapping(value = "/delT")
    public boolean delT(Integer id){
        try {
            System.out.println(id+"-----------------------");
            userService.delT(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
