package com.edu.hzau.cocs.swinedb.mapper;

import com.edu.hzau.cocs.swinedb.pojo.Swine;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @Author yue
 * @Date 2022/10/25 10:02
 */
@Repository
public interface SwineMapper {
    /**
     * 获取所有swine
     */
    List<Swine> getSwineList();

    /**
     * 通过id查询swine记录
     */
    Swine getSwineById(int id);

}
