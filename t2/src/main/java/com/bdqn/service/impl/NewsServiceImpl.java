package com.bdqn.service.impl;

import com.bdqn.entity.News;
import com.bdqn.dao.NewsDao;
import com.bdqn.service.NewsService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import javax.annotation.Resource;
import java.util.List;
import org.springframework.data.domain.Page;
/**
 * (News)表服务实现类
 *
 * @author makejava
 * @since 2020-02-13 10:41:52
 */
@Service("newsService")
public class NewsServiceImpl implements NewsService {
    @Resource
    private NewsDao newsDao;

    @Override
    public News queryById(Integer nid) {
        return this.newsDao.getOne(nid);
    }

    @Override
    public List<News> getall() {
        return this.newsDao.findAll();

    }
    
     @Override
    public Page<News> queryAllByLimit(int offset, int limit) {
        return this.newsDao.findAll(PageRequest.of((offset-1)
*limit,limit));
    }

    @Override
    public News insert(News news) {
       
        return this.newsDao.save(news);
    }


    @Override
    public News update(News news) {
       
        return this.newsDao.save(news);
    }

  
    @Override
    public boolean deleteById(Integer nid) {
    
     try{
             this.newsDao.deleteById(nid) ;
        }catch (Exception ex){
            return false;
        }
        return true;
      
    }
}