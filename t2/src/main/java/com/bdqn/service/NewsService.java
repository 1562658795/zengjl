package com.bdqn.service;

import com.bdqn.entity.News;
import java.util.List;
import org.springframework.data.domain.Page;
/**
 * (News)表服务接口
 *
 * @author zry
 * @since 2020-02-13 10:41:52
 */
public interface NewsService {
    News queryById(Integer nid);
    Page<News> queryAllByLimit(int offset, int limit);
    News insert(News news);
    News update(News news);
    boolean deleteById(Integer nid);
     List<News> getall();
}