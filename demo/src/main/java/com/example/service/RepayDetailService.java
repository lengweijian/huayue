package com.example.service;

import com.example.dto.outdto.RepayDetailOutDTO;

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
public interface RepayDetailService {
    void add(List<RepayDetailOutDTO> repayDetails);
    List<RepayDetailOutDTO> findAll();
}
