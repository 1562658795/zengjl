package com.bdqn.service.impl;

import com.bdqn.entity.Topic;
import com.bdqn.dao.TopicDao;
import com.bdqn.service.TopicService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import javax.annotation.Resource;
import java.util.List;
import org.springframework.data.domain.Page;
/**
 * (Topic)表服务实现类
 *
 * @author makejava
 * @since 2020-02-13 10:41:52
 */
@Service("topicService")
public class TopicServiceImpl implements TopicService {
    @Resource
    private TopicDao topicDao;

    @Override
    public Topic queryById(Integer tid) {
        return this.topicDao.getOne(tid);
    }

    @Override
    public List<Topic> getall() {
        return this.topicDao.findAll();

    }
    
     @Override
    public Page<Topic> queryAllByLimit(int offset, int limit) {
        return this.topicDao.findAll(PageRequest.of((offset-1)
*limit,limit));
    }

    @Override
    public Topic insert(Topic topic) {
       
        return this.topicDao.save(topic);
    }


    @Override
    public Topic update(Topic topic) {
       
        return this.topicDao.save(topic);
    }

  
    @Override
    public boolean deleteById(Integer tid) {
    
     try{
             this.topicDao.deleteById(tid) ;
        }catch (Exception ex){
            return false;
        }
        return true;
      
    }
}