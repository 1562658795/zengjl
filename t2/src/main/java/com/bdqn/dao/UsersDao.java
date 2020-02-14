package com.bdqn.dao;

import com.bdqn.entity.Users;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * (Users)表数据库访问层
 *
 * @author zry
 * @since 2020-02-13 10:41:52
 */
public interface UsersDao extends JpaRepository<Users ,Integer>{

  
}