package com.zhaofengyi.serviceImpl;

import com.zhaofengyi.dao.TypesMapper;
import com.zhaofengyi.pojo.Types;
import com.zhaofengyi.service.TypesServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypesServiceImpl implements TypesServer {

    @Autowired
    private TypesMapper typesMapper;


    @Override
    public List<Types> finAll() {
        return typesMapper.findAll();
    }
}
