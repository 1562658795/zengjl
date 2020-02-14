package com.bdqn.service;

import com.bdqn.entity.Topic;
import java.util.List;
import org.springframework.data.domain.Page;
/**
 * (Topic)表服务接口
 *
 * @author zry
 * @since 2020-02-13 10:41:52
 */
public interface TopicService {
    Topic queryById(Integer tid);
    Page<Topic> queryAllByLimit(int offset, int limit);
    Topic insert(Topic topic);
    Topic update(Topic topic);
    boolean deleteById(Integer tid);
     List<Topic> getall();
}