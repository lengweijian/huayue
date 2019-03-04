package com.example.service;

import com.example.dto.outdto.RepayResultOutDto;

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
public interface RepayResultService {
    List<RepayResultOutDto> findAll();
    void add(List<RepayResultOutDto> repayResultOutDtos);
}
