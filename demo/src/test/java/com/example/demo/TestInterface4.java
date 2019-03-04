package com.example.demo;

import com.example.utils.FileUtils;
import org.junit.Test;

/**
 * @ClassName TestInterface4
 * @Description 测试接口4
 * @Author LengWJ
 * @Date 2019/3/1  14:50
 * @Version 1.0
 */
public class TestInterface4 {

    @Test
    public void testInterface4_addOne(){
        // 获取文件名称
        String fileName = "RepayResult/XXXX00720180419RepayResult.txt";
        System.out.println(FileUtils.getContentByLine(fileName));

            // 调用工具类将接口json串转换成对象
        //RepayPlanOFLoanOutDTO jsonToBean = FastJsonUtils.getJsonToBean(response, RepayPlanOFLoanOutDTO.class);

        //HttpClientUtils.postHasParams(jsonToBean, Constant.INTERFACE2_ADDONE);

    }

}
