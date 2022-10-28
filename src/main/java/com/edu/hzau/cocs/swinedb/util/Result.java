package com.edu.hzau.cocs.swinedb.util;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author yue
 * @Date 2022/10/28 16:35
 */
@Data
public class Result {
    private boolean success;
    private Integer code;
    private Map<String, Object> data = new HashMap<>();

    public static Result ok() {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(ResultCode.SUCCESS);
        return result;
    }

    public static Result error() {
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(ResultCode.ERROR);
        return result;
    }

    public Result success(Boolean success){
        this.setSuccess(success);
        return this;
    }

    public Result code(Integer code){
        this.setCode(code);
        return this;
    }

    public Result data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    public Result data(Map<String, Object> map){
        this.setData(map);
        return this;
    }
}
