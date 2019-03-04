package com.example.controller;

import com.example.common.ResultVO;
import com.example.dto.outdto.RepayResultOutDto;
import com.example.service.RepayResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/RepayResult")
public class RepayResultController {

    @Autowired
    private RepayResultService repayResultService;

    @RequestMapping("/findAll")
    public ResultVO findAll(){
        try{
            return new ResultVO(200,"find success ",repayResultService.findAll());
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(500,"error",null);
        }
    }

    @RequestMapping("/add")
    public ResultVO add(List< RepayResultOutDto > repayResultOutDtos){
        try{
            repayResultService.add(repayResultOutDtos);
            return new ResultVO(200,"add success ",repayResultService.findAll());
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(500,"add error",null);
        }
    }
}
