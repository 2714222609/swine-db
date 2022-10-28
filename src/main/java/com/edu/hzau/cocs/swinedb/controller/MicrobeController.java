package com.edu.hzau.cocs.swinedb.controller;

import com.edu.hzau.cocs.swinedb.pojo.Microbe;
import com.edu.hzau.cocs.swinedb.service.MicrobeService;
import com.edu.hzau.cocs.swinedb.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author yue
 * @Date 2022/10/28 18:20
 */
@RestController
public class MicrobeController {
    @Autowired
    private MicrobeService microbeService;

    @RequestMapping("/getMicrobeList")
    public Result getMicrobeList() {
        List<Microbe> microbeList = microbeService.getMicrobeList();
        return Result.ok().data("microbeList", microbeList);
    }

    @RequestMapping("/getMicrobeById/{id}")
    public Result getMicrobeById(@PathVariable int id) {
        Microbe microbe = microbeService.getMicrobeById(id);
        if (microbe != null) {
            return Result.ok().data("microbe", microbe);
        }else {
            return Result.error();
        }
    }
}
