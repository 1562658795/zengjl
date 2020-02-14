package com.bdqn.controller;

import com.bdqn.entity.Topic;
import com.bdqn.service.TopicService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Topic)表控制层
 *
 * @author makejava
 * @since 2020-02-13 10:41:52
 */
@RestController
@RequestMapping("topic")
public class TopicController {
    /**
     * 服务对象
     */
    @Resource
    private TopicService topicService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Topic selectOne(Integer id) {
        return this.topicService.queryById(id);
    }

}