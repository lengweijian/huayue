package com.example.controller;

import com.example.dto.ResultDto;
import com.example.dto.indto.RepayPlanTrialInDTO;
import com.example.dto.outdto.RepayPlanTrialOutDTO;
import com.example.service.RepayPlanService;
import com.example.service.RepayPlanTrialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * 　* @Description: TODO
 * 　* @param ${tags}
 * 　* @return ${return_type}
 * 　* @throws
 * 　* @author lwj
 * 　* @date $date$ $time$
 *
 */
@RestController
@Controller
public class RepayPlanTrialController {

    @Autowired
    RepayPlanTrialService repayPlanTrialService;

    @Autowired
    RepayPlanService repayPlanService;

    @RequestMapping(value="/RepayPlanTrial",method = {RequestMethod.POST,RequestMethod.GET})
    public String RepayPlanTrial(@RequestBody(required=false) RepayPlanTrialInDTO inDTO){

        String response = "{\n" +
                "\t\"corporateCode\": \"007\",\n" +
                "\t\"infoContent\": \"ljH6J7OhGXwN2tkLTJtifDLFYzpou7FQWDa874vtkYUZ4wI8vOyV5eBqDkkp7\\/tI80B+Uoh9sE7qxaE+X3tWw\\/m0MN7YiV8j4HVdJyXdwA\\/vRxcKixHRo6Bk10tEsym07e8ZVxNoAASSgA4FMYXre95qLhnnzNGo5G4ZHy8OXqXGTtenvwo1uKopJBEfZTWxk3xywhVhE3K3j9Qns9W6mwKI9YyzkEgtU3Binod1ADJ4UqUsN6hK8267CEr4WxvXc264IauweWSyqzY7ka5cndeYZLc88WUphQ3jHwHtjZc=\",\n" +
                "\t\"respCode\": \"S\",\n" +
                "\t\"requestSeqNo\": \"201803291832151I8OEz\",\n" +
                "\t\"interfaceId\": \"RepayPlanTrial\",\n" +
                "\t\"respMsg\": \"\",\n" +
                "\t\"infoSign\": \"1cb3d36c1b3a3b9ddd23f94bcd0dc6b9\",\n" +
                "\t\"bankCode\": \"XXBC\",\n" +
                "\t\"productType\": \"2\"\n" +
                "}\n" +
                "\"retCode\": \"S\",\n" +
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
                "\t}]";
        if (inDTO != null)
            return response;
        else
            return "1111111";
    }

    @GetMapping("/findAll")
    public List<RepayPlanTrialOutDTO> findAll(){
        try{
            return repayPlanTrialService.showAll();
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }

    }

    @RequestMapping("/addOne")
    public ResultDto add(@RequestBody RepayPlanTrialOutDTO repayPlanTrialOutDTO){
        repayPlanTrialService.addOne(repayPlanTrialOutDTO);
       /* System.out.println("add....");
        try{
            // 添加主表信息

            repayPlanTrialService.addOne(repayPlanTrialOutDTO);
            List<RepayPlan> repayPlans = repayPlanTrialOutDTO.getResultList();
            if(repayPlans != null && repayPlans.size() > 0){
                // 添加从表信息
                for(RepayPlan repayPlan : repayPlans){
                    repayPlan.setRepayPlanTrialId(repayPlanTrialOutDTO.getId());
                    repayPlanService.addOne(repayPlan);
                }
            }
            return new ResultDto(null,"success");
        }catch(Exception e){
            e.printStackTrace();
            return new ResultDto("systemError","systemError");
        }*/
        return new ResultDto("systemError","systemError");
    }

}
