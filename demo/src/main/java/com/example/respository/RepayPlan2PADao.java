package com.example.respository;

import com.example.dto.outdto.RepayPlan2PAOutDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 　@Description: 银行还款计划文件同步至合作方
 * 　@param ${tags}
 * 　@return ${return_type}
 * 　@throws
 * 　@author lwj
 * 　@date $date$ $time$
 *
 */
@Repository
public interface RepayPlan2PADao extends JpaRepository<RepayPlan2PAOutDTO,String> {
}
