package com.edu.hzau.cocs.swinedb.service;

import com.edu.hzau.cocs.swinedb.pojo.Swine;

import java.util.List;

/**
 * @Author yue
 * @Date 2022/10/25 10:33
 */
public interface SwineService {
    /**
     * 获取所有swine
     */
    List<Swine> getSwineList();

    /**
     * 通过id查询swine记录
     */
    Swine getSwineById(int id);

}
