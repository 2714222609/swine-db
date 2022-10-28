package com.edu.hzau.cocs.swinedb.service;

import com.edu.hzau.cocs.swinedb.mapper.FeedMapper;
import com.edu.hzau.cocs.swinedb.pojo.Feed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author yue
 * @Date 2022/10/28 18:18
 */
@Service
public class FeedServiceImpl implements FeedService{

    @Autowired
    private FeedMapper feedMapper;

    @Override
    public List<Feed> getFeedList() {
        return feedMapper.getFeedList();
    }

    @Override
    public Feed getFeedById(int id) {
        return feedMapper.getFeedById(id);
    }
}
