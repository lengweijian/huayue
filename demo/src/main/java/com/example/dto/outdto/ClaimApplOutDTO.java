package com.example.dto.outdto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @Description 理赔申请文件
 *
 * @Author LengWJ
 *
 * @Date 2019/3/3  17:45
 *
 * @Version 1.0
 */

public class ClaimApplOutDTO implements Serializable {

    private Long id;
    /**
     * 1.借据号
     */
    private String loanNo;
    /**
     * 2.逾期总天数
     */
    private String capDays;
    /**
     * 3.逾期总本金
     */
    private BigDecimal capital;

    /**
     * 4.逾期利息
     */
    private BigDecimal iint;


    private BigDecimal oInt;
    private BigDecimal nInt;
    private BigDecimal curnInt;
    private BigDecimal claimAmt;
    private String claimMsg;

}
