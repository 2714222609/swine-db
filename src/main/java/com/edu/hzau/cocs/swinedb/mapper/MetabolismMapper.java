package com.edu.hzau.cocs.swinedb.mapper;

import com.edu.hzau.cocs.swinedb.pojo.Metabolism;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author yue
 * @Date 2022/10/28 18:08
 */
@Repository
public interface MetabolismMapper {
    /**
     * 获取所有Metabolism
     */
    List<Metabolism> getMetabolismList();

    /**
     * 通过id查询Metabolism记录
     */
    Metabolism getMetabolismById(int id);
}
