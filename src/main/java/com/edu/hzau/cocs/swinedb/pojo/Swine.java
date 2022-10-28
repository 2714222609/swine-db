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
    private int index;
    private String tag;
    private String colId;
    private int sex;
    private double ages;
    private double weights;
    private String assayStation;
}
