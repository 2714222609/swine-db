package com.edu.hzau.cocs.swinedb.controller;

import com.edu.hzau.cocs.swinedb.pojo.Swine;
import com.edu.hzau.cocs.swinedb.service.SwineService;
import com.edu.hzau.cocs.swinedb.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author yue
 * @Date 2022/10/25 10:31
 */
@RestController
public class SwineController {

    @Autowired
    private SwineService swineService;

    @RequestMapping("/getSwineList")
    public Result getSwineList() {
        List<Swine> swineList = swineService.getSwineList();
        return Result.ok().data("swineList", swineList);
    }

    @RequestMapping("/getSwineById/{id}")
    public Result getSwineById(@PathVariable int id) {
        Swine swine = swineService.getSwineById(id);
        if (swine != null) {
            return Result.ok().data("swine", swine);
        }else {
            return Result.error();
        }
    }

}
