package com.example.controller;

import com.example.common.ResultVO;
import com.example.dto.outdto.RepayPlanOFLoanOutDTO;
import com.example.service.RepayPlanOFLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName RepayPlanOFLoanController
 * @Description TODO
 * @Author LengWJ
 * @Date 2019/3/2  18:44
 * @Version 1.0
 */
@RestController
@RequestMapping("/RepayPlanOFLoan")
public class RepayPlanOFLoanController {

    @Autowired
    private RepayPlanOFLoanService repayPlanOFLoanService;

    @RequestMapping("/findAll")
    public ResultVO findAll(){
        try{
            return new ResultVO(200,"success",repayPlanOFLoanService.findAll());
        }catch(Exception e){
            e.printStackTrace();
            return new ResultVO(500,"can find data",null);
        }
    }

    @RequestMapping("/addOne")
    public ResultVO addOne(@RequestBody RepayPlanOFLoanOutDTO repayPlanOFLoanOutDTO){
        try{
            repayPlanOFLoanService.addOne(repayPlanOFLoanOutDTO);
            return new ResultVO(200,"add success",null);
        }catch(Exception e){
            e.printStackTrace();
            return new ResultVO(500,"add error",null);
        }
    }


}
