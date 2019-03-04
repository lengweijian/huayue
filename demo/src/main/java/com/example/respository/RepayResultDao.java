package com.example.respository;

import com.example.dto.outdto.RepayResultOutDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @Description TODO
 *
 * @Author LengWJ
 *
 * @Date 2019/3/4  10:21
 *
 * @Version 1.0
 */
@Repository
public interface RepayResultDao extends JpaRepository<RepayResultOutDto,String> {

}
