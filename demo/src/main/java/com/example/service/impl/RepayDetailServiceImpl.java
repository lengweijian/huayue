package com.example.service.impl; /**
 * 　* @Description: TODO
 * 　* @param ${tags}
 * 　* @return ${return_type}
 * 　* @throws
 * 　* @author lwj
 * 　* @date $date$ $time$
 *
 */

import com.example.dto.outdto.RepayDetailOutDTO;
import com.example.respository.RepayDetailDao;
import com.example.service.RepayDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @Description TODO
 *
 * @Author LengWJ
 *
 * @Date 2019/3/4  7:24
 *
 * @Version 1.0
 */
@Service
public class RepayDetailServiceImpl implements RepayDetailService {

    @Autowired
    private RepayDetailDao repayDetailDao;

    @Override
    public void add(List<RepayDetailOutDTO> repayDetails) {
        repayDetailDao.save(repayDetails);
    }

    @Override
    public List<RepayDetailOutDTO> findAll() {
        return repayDetailDao.findAll();
    }
}
