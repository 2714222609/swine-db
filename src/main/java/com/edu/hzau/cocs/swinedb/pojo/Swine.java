package com.edu.hzau.cocs.swinedb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author yue
 * @Date 2022/10/25 10:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Swine {
    private int id;
    private String name;
    private int age;
}
