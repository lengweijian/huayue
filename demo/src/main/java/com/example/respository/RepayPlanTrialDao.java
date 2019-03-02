package com.example.respository;

import com.example.dto.outdto.RepayPlanTrialOutDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * 　@Description: 审批过程中获取银行的还款计划展示给借款人
 * 　@author lwj
 * 　@date $date$ $time$
 *
 */
@Repository
public interface RepayPlanTrialDao extends JpaRepository<RepayPlanTrialOutDTO,String> {

    /**
     * 查询全部输出参数
     */
    @Query(value="select * from tb_repay_plan_trial rpt left join tb_repay_plan rp on rpt.id = rp.repay_plan_trial_id",nativeQuery = true)
    List<RepayPlanTrialOutDTO> showAll();

}
