package com.example.dto.outdto;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 　* @Description: TODO
 * 　* @param ${tags}
 * 　* @return ${return_type}
 * 　* @throws
 * 　* @author lwj
 * 　* @date $date$ $time$
 *
 */

@Entity
@Table(name="tb_RepayPlan")
public class RepayPlan implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    /**
     *  期数
     *
     */
    @Column(name="termNo",nullable=false)
    private String termNo;

    /**
     * 本期应还款日
     */
    @Column(name="dueDate",nullable=false)
    private String dueDate;

    /**
     * 本期应还本金
     */
    @Column(name="dueCapital",nullable=false)
    private BigDecimal dueCapital;

    /**
     * 本期应还利息
     */
    @Column(name="dueInt",nullable=false)
    private BigDecimal dueInt;

   /* @ManyToOne()
    private RepayPlanTrialOutDTO repayPlanTrialOutDTO;*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTermNo() {
        return termNo;
    }

    public void setTermNo(String termNo) {
        this.termNo = termNo;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public BigDecimal getDueCapital() {
        return dueCapital;
    }

    public void setDueCapital(BigDecimal dueCapital) {
        this.dueCapital = dueCapital;
    }

    public BigDecimal getDueInt() {
        return dueInt;
    }

    public void setDueInt(BigDecimal dueInt) {
        this.dueInt = dueInt;
    }

    /*public RepayPlanTrialOutDTO getRepayPlanTrialOutDTO() {
        return repayPlanTrialOutDTO;
    }

    public void setRepayPlanTrialOutDTO(RepayPlanTrialOutDTO repayPlanTrialOutDTO) {
        this.repayPlanTrialOutDTO = repayPlanTrialOutDTO;
    }*/

    @Override
    public String toString() {
        return "RepayPlan{" +
                "id='" + id + '\'' +
                ", termNo='" + termNo + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", dueCapital=" + dueCapital +
                ", dueInt=" + dueInt +
                '}';
    }
}
