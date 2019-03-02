package com.example.service;

import com.example.dto.outdto.RepayPlanTrialOutDTO;

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

public interface RepayPlanTrialService {

    /**
     * 查询全部
     */
    List<RepayPlanTrialOutDTO> showAll();

    // 添加
    void addOne(RepayPlanTrialOutDTO repayPlanTrialOutDTO);
    // 删除

    // 查询一条

    //修改
}
