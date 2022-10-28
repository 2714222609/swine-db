package com.edu.hzau.cocs.swinedb.controller;

import com.edu.hzau.cocs.swinedb.pojo.Metabolism;
import com.edu.hzau.cocs.swinedb.service.MetabolismService;
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
public class MetabolismController {
    @Autowired
    private MetabolismService metabolismService;

    @RequestMapping("/getMetabolismList")
    public Result getMetabolismList() {
        List<Metabolism> metabolismList = metabolismService.getMetabolismList();
        return Result.ok().data("metabolismList", metabolismList);
    }

    @RequestMapping("/getMetabolismById/{id}")
    public Result getMetabolismById(@PathVariable int id) {
        Metabolism metabolism = metabolismService.getMetabolismById(id);
        if (metabolism != null) {
            return Result.ok().data("metabolism", metabolism);
        }else {
            return Result.error();
        }
    }
}
