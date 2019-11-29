package com.zhaofengyi.dao;

import com.zhaofengyi.pojo.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UsersMapper extends JpaRepository<Users,Integer>, JpaSpecificationExecutor<Users> {
}
