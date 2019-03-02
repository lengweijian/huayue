package com.example.service;

import com.example.dto.outdto.RepayPlanOFLoanOutDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

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
@Service
public interface RepayPlanOFLoanService {

    List<RepayPlanOFLoanOutDTO> findAll();

    void addOne(RepayPlanOFLoanOutDTO repayPlanOFLoanOutDTO);
}
