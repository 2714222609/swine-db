package com.edu.hzau.cocs.swinedb.service;

import com.edu.hzau.cocs.swinedb.pojo.Microbe;
import com.edu.hzau.cocs.swinedb.pojo.Swine;

import java.util.List;

/**
 * @Author yue
 * @Date 2022/10/28 18:17
 */
public interface MicrobeService {
    /**
     * 获取所有Microbe
     */
    List<Microbe> getMicrobeList();

    /**
     * 通过id查询Microbe记录
     */
    Microbe getMicrobeById(int id);
}
