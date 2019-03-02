package com.example.demo;

import com.example.constant.Constant;
import com.example.dto.outdto.RepayPlanTrialOutDTO;
import com.example.utils.FastJsonUtils;
import com.example.utils.HttpClientUtils;
import org.junit.Test;

/**
 * @ClassName TestInterface1
 * @Description 测试接口1
 * @Author LengWJ
 * @Date 2019/3/1  14:50
 * @Version 1.0
 */
public class TestInterface1 {

    @Test
    public void testInterface1(){
            // 3.输入参数
        /*RepayPlanTrialInDTO repayPlanTrialInDTO = new RepayPlanTrialInDTO();
        repayPlanTrialInDTO.setIntRate("111");
        repayPlanTrialInDTO.setOpenDate("222");
        repayPlanTrialInDTO.setRpyMthd("444");
        repayPlanTrialInDTO.setTermNo("555");
        repayPlanTrialInDTO.setTrxAmt(new BigDecimal("3.14"));

        postHasParams(repayPlanTrialInDTO);*/

            // 1.添加返回数据到mysql
            // mock的接口参数为response
            String response = "{\n" +
                    "\t\"corporateCode\": \"007\",\n" +
                    "\t\"infoContent\": \"ljH6J7OhGXwN2tkLTJtifDLFYzpou7FQWDa874vtkYUZ4wI8vOyV5eBqDkkp7\\/tI80B+Uoh9sE7qxaE+X3tWw\\/m0MN7YiV8j4HVdJyXdwA\\/vRxcKixHRo6Bk10tEsym07e8ZVxNoAASSgA4FMYXre95qLhnnzNGo5G4ZHy8OXqXGTtenvwo1uKopJBEfZTWxk3xywhVhE3K3j9Qns9W6mwKI9YyzkEgtU3Binod1ADJ4UqUsN6hK8267CEr4WxvXc264IauweWSyqzY7ka5cndeYZLc88WUphQ3jHwHtjZc=\",\n" +
                    "\t\"respCode\": \"S\",\n" +
                    "\t\"requestSeqNo\": \"201803291832151I8OEz\",\n" +
                    "\t\"interfaceId\": \"RepayPlanTrial\",\n" +
                    "\t\"respMsg\": \"\",\n" +
                    "\t\"infoSign\": \"1cb3d36c1b3a3b9ddd23f94bcd0dc6b9\",\n" +
                    "\t\"bankCode\": \"XXBC\",\n" +
                    "\t\"productType\": \"2\",\n" +
                    "\t\"retCode\": \"S\",\n" +
                    "\t\"retMsg\": \"接收成功\",\n" +
                    "\t\"resultList\": [{\n" +
                    "\t\t\"termNo\": \"1\",\n" +
                    "\t\t\"dueCapital\": \"10000\",\n" +
                    "\t\t\"dueDate\": \"20180501\",\n" +
                    "\t\t\"dueInt\": \"400\"\n" +
                    "\t}, {\n" +
                    "\t\t\"termNo\": \"2\",\n" +
                    "\t\t\"dueCapital\": \"10100\",\n" +
                    "\t\t\"dueDate\": \"20180601\",\n" +
                    "\t\t\"dueInt\": \"300\"\n" +
                    "\t}]\n" +
                    "}";
            // 调用工具类将接口json串转换成对象
            RepayPlanTrialOutDTO jsonToBean = FastJsonUtils.getJsonToBean(response, RepayPlanTrialOutDTO.class);

            /*List<RepayPlan> resultList = jsonToBean.getResultList();

            List<RepayPlan> newResult = new ArrayList<>();
            for (RepayPlan one : resultList) {
                //one.setId(UUID.randomUUID().toString());
                newResult.add(one);
            }
            sonToBean.setResultList(newResult);*/
            // 调用接口执行添加操作
            // System.out.println(jsonToBean.toString());
            // HttpClientUtils.postHasParams(jsonToBean, Constant.INTERFACE1_ADDONE);
        HttpClientUtils.postHasParams(jsonToBean, Constant.INTERFACE1_ADDONE);

    }

    @Test
    public void test(){

    }
}
