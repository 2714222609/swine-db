package com.edu.hzau.cocs.swinedb.controller;

import com.edu.hzau.cocs.swinedb.pojo.Feed;
import com.edu.hzau.cocs.swinedb.service.FeedService;
import com.edu.hzau.cocs.swinedb.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author yue
 * @Date 2022/10/28 18:20
 */
@RestController
public class FeedController {
    @Autowired
    private FeedService feedService;

    @RequestMapping("/getFeedList")
    public Result getFeedList() {
        List<Feed> feedList = feedService.getFeedList();
        return Result.ok().data("feedList", feedList);
    }

    @RequestMapping("/getFeedById/{id}")
    public Result getFeedById(@PathVariable int id) {
        Feed feed = feedService.getFeedById(id);
        if (feed != null) {
            return Result.ok().data("feed", feed);
        }else {
            return Result.error();
        }
    }
}
