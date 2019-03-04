package com.example.controller; /**
 * 　* @Description: TODO
 * 　* @param ${tags}
 * 　* @return ${return_type}
 * 　* @throws
 * 　* @author lwj
 * 　* @date $date$ $time$
 *
 */

import com.example.common.ResultMessageConstants;
import com.example.common.ResultVO;
import com.example.dto.outdto.RepayDetailOutDTO;
import com.example.service.RepayDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;
import java.util.List;

/**
 *
 * @Description TODO
 *
 * @Author LengWJ
 *
 * @Date 2019/3/4  7:31
 *
 * @Version 1.0
 */
@RestController
@RequestMapping("/RepayDetail")
public class RepayDetailController {

    @Autowired
    private RepayDetailService repayDetailService;

    @RequestMapping("/findAll")
    public ResultVO findAll(){
        try{
            return new ResultVO(ResultMessageConstants.SUCCESS,"success",repayDetailService.findAll());
        }catch(Exception e){
            e.printStackTrace();
            return new ResultVO(ResultMessageConstants.ERROR,"can't find data",null);

        }
    }

    @RequestMapping("/add")
    public ResultVO add(@RequestBody List<RepayDetailOutDTO> repayDetailOutDTOs){
        try{
            repayDetailService.add(repayDetailOutDTOs);
            return new ResultVO<>(200,"add success",null);
        }catch(Exception e){
            e.printStackTrace();
            return new ResultVO<>(500,"add error",null);
        }
    }

}
