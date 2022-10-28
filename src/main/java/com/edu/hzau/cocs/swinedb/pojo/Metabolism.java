package com.edu.hzau.cocs.swinedb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Repository;

/**
 * @Author yue
 * @Date 2022/10/28 19:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Metabolism {
    private int index;
    private String metabolismName;
    private double foldChange;
    private double pValue;
    private double vip;
    private String sample;
    private String identification;
    private double time;
}
