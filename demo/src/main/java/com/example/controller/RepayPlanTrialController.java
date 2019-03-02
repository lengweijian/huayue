package com.example.controller;

import com.example.common.ResultVO;
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
public class RepayPlanTrialController {

    @Autowired
    RepayPlanTrialService repayPlanTrialService;

    @GetMapping("/findAll")
    public ResultVO findAll(){
        try{
            return new ResultVO(200,"success",repayPlanTrialService.showAll());
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(404,"error",null);
        }

    }

    @RequestMapping("/addOne")
    public ResultVO addOne(@RequestBody RepayPlanTrialOutDTO repayPlanTrialOutDTO){
        try{
            repayPlanTrialService.addOne(repayPlanTrialOutDTO);
            return new ResultVO(200,"success",null);
        }catch(Exception e){
            e.printStackTrace();
            return new ResultVO(500,"add error",null);
        }

    }

}
