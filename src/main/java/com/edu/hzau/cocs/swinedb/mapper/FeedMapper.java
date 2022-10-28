package com.edu.hzau.cocs.swinedb.mapper;

import com.edu.hzau.cocs.swinedb.pojo.Feed;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author yue
 * @Date 2022/10/28 18:08
 */
@Repository
public interface FeedMapper {
    /**
     * 获取所有Feed
     */
    List<Feed> getFeedList();

    /**
     * 通过id查询Feed记录
     */
    Feed getFeedById(int id);
}
