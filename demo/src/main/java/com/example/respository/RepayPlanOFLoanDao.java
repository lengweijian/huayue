package com.example.respository;

import com.example.dto.outdto.RepayPlanOFLoanOutDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 　* @Description: TODO
 * 　* @param ${tags}
 * 　* @return ${return_type}
 * 　* @throws
 * 　* @author lwj
 * 　* @date $date$ $time$
 *
 */
@Repository
public interface RepayPlanOFLoanDao extends JpaRepository<RepayPlanOFLoanOutDTO, String> {


}
