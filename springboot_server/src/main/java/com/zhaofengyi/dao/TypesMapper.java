package com.zhaofengyi.dao;

import com.zhaofengyi.pojo.Types;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TypesMapper extends JpaRepository<Types,Integer>, JpaSpecificationExecutor<Types> {
}
