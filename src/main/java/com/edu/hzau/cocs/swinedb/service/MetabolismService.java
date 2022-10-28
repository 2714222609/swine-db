package com.edu.hzau.cocs.swinedb.service;

import com.edu.hzau.cocs.swinedb.pojo.Metabolism;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author yue
 * @Date 2022/10/28 18:17
 */
public interface MetabolismService {
    /**
     * 获取所有Metabolism
     */
    List<Metabolism> getMetabolismList();

    /**
     * 通过id查询Metabolism记录
     */
    Metabolism getMetabolismById(int id);
}
