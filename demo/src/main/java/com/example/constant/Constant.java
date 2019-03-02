package com.example.constant;

import org.springframework.stereotype.Component;

/**

/**
 * @ClassName Constant
 * @Description 全局常量
 * @Author LengWJ
 * @Date 2019/3/1  14:48
 * @Version 1.0
 */
public class Constant {

    /**
     *  接口1 :查询全部
     *
     */
    public static final String INTERFACE1_FINDALL = "http://localhost:12345/RepayPlanTrial/findAll";

    /**
     *  接口1 : 添加一条
     */
    public static final String INTERFACE1_ADDONE = "http://localhost:12345/RepayPlanTrial/addOne";

    /**
     *  接口2 :查询全部
     *
     */
    public static final String INTERFACE2_FINDALL = "http://localhost:12345/RepayPlanOFLoan/findAll";

    /**
     *  接口2 : 添加一条
     */
    public static final String INTERFACE2_ADDONE = "http://localhost:12345/RepayPlanOFLoan/addOne";
}
