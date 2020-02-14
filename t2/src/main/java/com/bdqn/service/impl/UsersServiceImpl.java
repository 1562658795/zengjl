package com.bdqn.service.impl;

import com.bdqn.entity.Users;
import com.bdqn.dao.UsersDao;
import com.bdqn.service.UsersService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import javax.annotation.Resource;
import java.util.List;
import org.springframework.data.domain.Page;
/**
 * (Users)表服务实现类
 *
 * @author makejava
 * @since 2020-02-13 10:41:52
 */
@Service("usersService")
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersDao usersDao;

    @Override
    public Users queryById(Integer uuid) {
        return this.usersDao.getOne(uuid);
    }

    @Override
    public List<Users> getall() {
        return this.usersDao.findAll();

    }
    
     @Override
    public Page<Users> queryAllByLimit(int offset, int limit) {
        return this.usersDao.findAll(PageRequest.of((offset-1)
*limit,limit));
    }

    @Override
    public Users insert(Users users) {
       
        return this.usersDao.save(users);
    }


    @Override
    public Users update(Users users) {
       
        return this.usersDao.save(users);
    }

  
    @Override
    public boolean deleteById(Integer uuid) {
    
     try{
             this.usersDao.deleteById(uuid) ;
        }catch (Exception ex){
            return false;
        }
        return true;
      
    }
}