package com.example.service.impl; /**
 * 　* @Description: TODO
 * 　* @param ${tags}
 * 　* @return ${return_type}
 * 　* @throws
 * 　* @author lwj
 * 　* @date date time
 *
 */

import com.example.dto.outdto.RepayPlanOFLoanOutDTO;
import com.example.respository.RepayPlanOFLoanDao;
import com.example.service.RepayPlanOFLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName RepayPlanOFLoanServiceImpl
 * @Description TODO
 * @Author LengWJ
 * @Date 2019/3/2  18:42
 * @Version 1.0
 */
@Service
public class RepayPlanOFLoanServiceImpl implements RepayPlanOFLoanService {

    @Autowired
    private RepayPlanOFLoanDao repayPlanOFLoanDao;

    @Override
    public List<RepayPlanOFLoanOutDTO> findAll() {
        return repayPlanOFLoanDao.findAll();
    }

    @Override
    public void addOne(RepayPlanOFLoanOutDTO repayPlanOFLoanOutDTO) {
        repayPlanOFLoanDao.save(repayPlanOFLoanOutDTO);
    }


}
