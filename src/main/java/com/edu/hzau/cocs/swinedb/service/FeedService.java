package com.edu.hzau.cocs.swinedb.service;

import com.edu.hzau.cocs.swinedb.pojo.Feed;

import java.util.List;

/**
 * @Author yue
 * @Date 2022/10/25 10:33
 */
public interface FeedService {
    /**
     * 获取所有feed
     */
    List<Feed> getFeedList();

    /**
     * 通过id查询feed记录
     */
    Feed getFeedById(int id);

}
