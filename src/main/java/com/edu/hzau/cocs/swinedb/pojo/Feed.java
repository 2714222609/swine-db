package com.edu.hzau.cocs.swinedb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author yue
 * @Date 2022/10/28 19:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Feed {
    private int index;
    private String tag;
    private double time;
    private double nurseingFeedPercentage;
    private double phase1FeedPercentage;
    private double phase2FeedPercentage;
    private double phase3FeedPercentage;
    private double dayOfIntake;
}
