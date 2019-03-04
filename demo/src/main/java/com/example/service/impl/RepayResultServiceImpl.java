package com.example.service.impl;

import com.example.dto.outdto.RepayResultOutDto;
import com.example.respository.RepayResultDao;
import com.example.service.RepayResultService;
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
public class RepayResultServiceImpl implements RepayResultService {

    @Autowired
    private RepayResultDao repayResultDao;

    @Override
    public List<RepayResultOutDto> findAll() {
        return repayResultDao.findAll();
    }

    @Override
    public void add(List<RepayResultOutDto> repayResultOutDtos) {
        repayResultDao.save(repayResultOutDtos);
    }


}
