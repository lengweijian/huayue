package com.example.respository;

import com.example.dto.outdto.RepayDetailOutDTO;
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
public interface RepayDetailDao extends JpaRepository<RepayDetailOutDTO,String> {
    
}
