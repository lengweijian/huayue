package com.example.controller;

import com.example.common.ResultVO;
import com.example.dto.outdto.RepayPlan2PAOutDTO;
import com.example.service.RepayPlan2PAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName RepayPlan2PAController
 * @Description interface3
 * @Author LengWJ
 * @Date 2019/3/3  9:24
 * @Version 1.0
 */
@RestController
@RequestMapping("/RepayPlan2PA")
public class RepayPlan2PAController {

    @Autowired
    RepayPlan2PAService repayPlan2PAService;

    @RequestMapping("/findAll")
    public ResultVO findAll(){
        try{
            return new ResultVO(200,"success",repayPlan2PAService.findAll());
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(500,"can't find data",null);
        }

    }

    @RequestMapping("/addOne")
    public ResultVO addOne(@RequestBody RepayPlan2PAOutDTO repayPlan2PAOutDTO){
        try{
            repayPlan2PAService.addOne(repayPlan2PAOutDTO);
            return new ResultVO(200,"add success!");
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(500,"add error",null);
        }

    }
}
