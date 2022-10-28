package com.edu.hzau.cocs.swinedb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author yue
 * @Date 2022/10/28 18:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Microbe {
    private int id;
    private String taxonomy;
    private String microbeName;
    private String col;
    private double days;
    private double abundance;
    private double pValueDpfTpf;
    private double pValueAge;
}
