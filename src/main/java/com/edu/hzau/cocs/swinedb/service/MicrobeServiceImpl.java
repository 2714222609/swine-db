package com.edu.hzau.cocs.swinedb.service;

import com.edu.hzau.cocs.swinedb.mapper.MicrobeMapper;
import com.edu.hzau.cocs.swinedb.pojo.Microbe;
import com.edu.hzau.cocs.swinedb.pojo.Swine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author yue
 * @Date 2022/10/28 18:18
 */
@Service
public class MicrobeServiceImpl implements MicrobeService{

    @Autowired
    private MicrobeMapper microbeMapper;

    @Override
    public List<Microbe> getMicrobeList() {
        return microbeMapper.getMicrobeList();
    }

    @Override
    public Microbe getMicrobeById(int id) {
        return microbeMapper.getMicrobeById(id);
    }
}
