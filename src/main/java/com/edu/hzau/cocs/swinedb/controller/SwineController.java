package com.edu.hzau.cocs.swinedb.controller;

import com.edu.hzau.cocs.swinedb.pojo.Swine;
import com.edu.hzau.cocs.swinedb.service.SwineService;
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
    public List<Swine> getSwineList() {
        List<Swine> swineList = swineService.getSwineList();
        for (Swine swine : swineList) {
            System.out.println(swine);
        }
        return swineList;
    }

    @RequestMapping("/getSwineById/{id}")
    public Swine getSwineById(@PathVariable int id) {
        return swineService.getSwineById(id);
    }

    @RequestMapping("/addSwine/{id}")
    public String addSwine(@PathVariable int id) {
        int res = swineService.addSwine(new Swine(id, "qiaozhi", 12));
        return res == 0 ? "添加失败" : "添加成功";
    }

    @RequestMapping("/updateSwine/{id}")
    public String updateSwine(@PathVariable int id) {
        int res = swineService.updateSwine(new Swine(id, "heihei", 2));
        return res == 0 ? "修改失败" : "修改成功";
    }

    @RequestMapping("/deleteSwine/{id}")
    public String deleteSwine(@PathVariable int id) {
        int res = swineService.deleteSwine(id);
        return res == 0 ? "删除失败" : "删除成功";
    }
}
