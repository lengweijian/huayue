package com.example.service;

import com.example.dto.outdto.RepayPlanTrialOutDTO;
import com.example.respository.RepayPlanTrialDao;
import org.springframework.beans.factory.annotation.Autowired;
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
public class RepayPlanTrialServiceImpl implements RepayPlanTrialService{


    @Autowired
    private RepayPlanTrialDao repayPlanTrialDao;

    @Autowired
    private RepayPlanService repayPlanService;
    @Override
    public List<RepayPlanTrialOutDTO> showAll() {
/*
        List<RepayPlanTrialOutDTO> resultSet = repayPlanTrialDao.findAll();
        List<RepayPlanTrialOutDTO> newResultSet = new ArrayList<>();
        // 根据主表ID去字表查询关联数据
        for(RepayPlanTrialOutDTO oneResultSet :  resultSet){
            List<RepayPlan> repayPlan = repayPlanService.findByRepayPlanTrialId(oneResultSet.getId());//根据主表ID去查询关联字表数据
            oneResultSet.setResultList(repayPlan);
            newResultSet.add(oneResultSet);
        }
*/
        return repayPlanTrialDao.findAll();
    }

    @Override
    public void addOne(RepayPlanTrialOutDTO repayPlanTrialOutDTO) {
        repayPlanTrialDao.save(repayPlanTrialOutDTO);
    }
}
