package com.example.demo;

import com.example.constant.Constant;
import com.example.dto.outdto.RepayPlanOFLoanOutDTO;
import com.example.utils.FastJsonUtils;
import com.example.utils.FileUtils;
import com.example.utils.HttpClientUtils;
import org.junit.Test;

/**
 * @ClassName TestInterface5
 * @Description 测试接口5
 * @Author LengWJ
 * @Date 2019/3/1  14:50
 * @Version 1.0
 */
public class TestInterface5 {

    @Test
    public void testInterface5_addOne(){
        String fileName = "RepayDetail/XXXX00720180415RepayDetail.txt";
        System.out.println(FileUtils.getContentByLine(fileName));

            // 调用工具类将接口json串转换成对象
        //RepayPlanOFLoanOutDTO jsonToBean = FastJsonUtils.getJsonToBean(response, RepayPlanOFLoanOutDTO.class);

        //HttpClientUtils.postHasParams(jsonToBean, Constant.INTERFACE2_ADDONE);

    }

}
