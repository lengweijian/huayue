package com.example.respository;

import com.example.dto.outdto.RepayPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 　@Description: TODO
 *   @param ${tags}
 * 　@return ${return_type}
 * 　@throws
 * 　@author lwj
 * 　@date $date$ $time$
 *
 */
@Repository
public interface RepayPlanDao extends JpaRepository<RepayPlan,String> {

}
