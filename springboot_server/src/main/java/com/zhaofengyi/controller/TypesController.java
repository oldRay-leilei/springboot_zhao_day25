package com.zhaofengyi.controller;

import com.zhaofengyi.pojo.Types;
import com.zhaofengyi.service.TypesServer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@Api(value = "一的一方类型表")
@RestController
@RequestMapping(value = "/Types")
@CrossOrigin
public class TypesController {

    @Autowired
    private TypesServer typesServer;


    @ApiOperation(value = "详情信息")
    @RequestMapping(value = "/selectTypesList")
    public List<Types> selectTypesList(){

        return typesServer.finAll();
    }

}
