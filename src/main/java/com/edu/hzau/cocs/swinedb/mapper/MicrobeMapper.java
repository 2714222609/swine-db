package com.edu.hzau.cocs.swinedb.mapper;

import com.edu.hzau.cocs.swinedb.pojo.Microbe;
import com.edu.hzau.cocs.swinedb.pojo.Swine;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author yue
 * @Date 2022/10/28 18:08
 */
@Repository
public interface MicrobeMapper {
    /**
     * 获取所有Microbe
     */
    List<Microbe> getMicrobeList();

    /**
     * 通过id查询Microbe记录
     */
    Microbe getMicrobeById(int id);
}
