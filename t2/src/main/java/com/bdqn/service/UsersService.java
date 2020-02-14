package com.bdqn.service;

import com.bdqn.entity.Users;
import java.util.List;
import org.springframework.data.domain.Page;
/**
 * (Users)表服务接口
 *
 * @author zry
 * @since 2020-02-13 10:41:52
 */
public interface UsersService {
    Users queryById(Integer uuid);
    Page<Users> queryAllByLimit(int offset, int limit);
    Users insert(Users users);
    Users update(Users users);
    boolean deleteById(Integer uuid);
     List<Users> getall();
}