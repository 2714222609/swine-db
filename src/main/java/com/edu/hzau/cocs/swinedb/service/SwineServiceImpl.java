package com.edu.hzau.cocs.swinedb.service;

import com.edu.hzau.cocs.swinedb.mapper.SwineMapper;
import com.edu.hzau.cocs.swinedb.pojo.Swine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author yue
 * @Date 2022/10/25 10:34
 */
@Service
public class SwineServiceImpl implements SwineService{

    @Autowired
    private SwineMapper swineMapper;

    @Override
    public List<Swine> getSwineList() {
        return swineMapper.getSwineList();
    }

    @Override
    public Swine getSwineById(int id) {
        return swineMapper.getSwineById(id);
    }

    @Override
    public int addSwine(Swine swine) {
        return swineMapper.addSwine(swine);
    }

    @Override
    public int updateSwine(Swine swine) {
        return swineMapper.updateSwine(swine);
    }

    @Override
    public int deleteSwine(int id) {
        return swineMapper.deleteSwine(id);
    }
}
