package com.example.service.impl;
import com.example.dto.outdto.RepayPlan2PAOutDTO;
import com.example.respository.RepayPlan2PADao;
import com.example.service.RepayPlan2PAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName RepayPlan2PAServiceImpl
 * @Description TODO
 * @Author LengWJ
 * @Date 2019/3/3  9:21
 * @Version 1.0
 */
@Service
public class RepayPlan2PAServiceImpl implements RepayPlan2PAService {

    @Autowired
    RepayPlan2PADao repayPlan2PADao;

    @Override
    public List<RepayPlan2PAOutDTO> findAll() {
        return repayPlan2PADao.findAll();
    }

    @Override
    public void addOne(RepayPlan2PAOutDTO repayPlan2PAOutDTO) {
        repayPlan2PADao.save(repayPlan2PAOutDTO);
    }
}
