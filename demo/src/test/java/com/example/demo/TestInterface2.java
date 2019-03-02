package com.example.demo;

import com.example.constant.Constant;
import com.example.dto.outdto.RepayPlanOFLoanOutDTO;
import com.example.dto.outdto.RepayPlanTrialOutDTO;
import com.example.utils.FastJsonUtils;
import com.example.utils.HttpClientUtils;
import org.junit.Test;

/**
 * @ClassName TestInterface2
 * @Description 测试接口2
 * @Author LengWJ
 * @Date 2019/3/1  14:50
 * @Version 1.0
 */
public class TestInterface2 {

    @Test
    public void testInterface2_addOne(){
            String response = "{\n" +
                    "\t\"retCode\": \"S\",\n" +
                    "\t\"retMsg\": \"接收成功\",\n" +
                    "\t\"planlist\": [{\n" +
                    "\t\t\"CurTermStatus\": \"9\",\n" +
                    "\t\t\"oweInt\": \"200\",\n" +
                    "\t\t\"dueOInt\": \"0\",\n" +
                    "\t\t\"odIntRate\": \"10.6\",\n" +
                    "\t\t\"oweOInt\": \"0\",\n" +
                    "\t\t\"settleDate\": \"\",\n" +
                    "\t\t\"loanNo\": \"LN2353533636322\",\n" +
                    "\t\t\"dueCapital\": \"5000\",\n" +
                    "\t\t\"intRate\": \"7.6\",\n" +
                    "\t\t\"oweCapital\": \"5000\",\n" +
                    "\t\t\"termNo\": \"1\",\n" +
                    "\t\t\"dueInt\": \"200\",\n" +
                    "\t\t\"dueDate\": \"20180601\"\n" +
                    "\t}, {\n" +
                    "\t\t\"CurTermStatus\": \"9\",\n" +
                    "\t\t\"oweInt\": \"200\",\n" +
                    "\t\t\"dueOInt\": \"0\",\n" +
                    "\t\t\"odIntRate\": \"10.6\",\n" +
                    "\t\t\"oweOInt\": \"0\",\n" +
                    "\t\t\"settleDate\": \"\",\n" +
                    "\t\t\"loanNo\": \"LN2353533636322\",\n" +
                    "\t\t\"dueCapital\": \"5000\",\n" +
                    "\t\t\"intRate\": \"7.6\",\n" +
                    "\t\t\"oweCapital\": \"5000\",\n" +
                    "\t\t\"termNo\": \"2\",\n" +
                    "\t\t\"dueInt\": \"200\",\n" +
                    "\t\t\"dueDate\": \"20180701\"\n" +
                    "\t}]\n" +
                    "}";
            // 调用工具类将接口json串转换成对象
        RepayPlanOFLoanOutDTO jsonToBean = FastJsonUtils.getJsonToBean(response, RepayPlanOFLoanOutDTO.class);

        HttpClientUtils.postHasParams(jsonToBean, Constant.INTERFACE2_ADDONE);

    }

    @Test
    public void testInterface2_findAll(){
        HttpClientUtils.postHasParams(null, Constant.INTERFACE2_FINDALL);
    }
}
