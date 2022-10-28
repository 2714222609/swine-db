package com.edu.hzau.cocs.swinedb.service;

import com.edu.hzau.cocs.swinedb.mapper.MetabolismMapper;
import com.edu.hzau.cocs.swinedb.pojo.Metabolism;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author yue
 * @Date 2022/10/28 18:18
 */
@Service
public class MetabolismServiceImpl implements MetabolismService{

    @Autowired
    private MetabolismMapper metabolismMapper;

    @Override
    public List<Metabolism> getMetabolismList() {
        return metabolismMapper.getMetabolismList();
    }

    @Override
    public Metabolism getMetabolismById(int id) {
        return metabolismMapper.getMetabolismById(id);
    }
}
