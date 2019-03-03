package com.example.service;

import com.example.dto.outdto.RepayPlan2PAOutDTO;

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
public interface RepayPlan2PAService {
    List<RepayPlan2PAOutDTO> findAll();
    void addOne(RepayPlan2PAOutDTO repayPlan2PAOutDTO);
}
