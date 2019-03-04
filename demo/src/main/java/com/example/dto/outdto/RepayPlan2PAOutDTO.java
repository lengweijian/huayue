package com.example.dto.outdto;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * @ClassName RepayPlan2PAOutDTO
 * @Description 银行还款计划文件同步至合作方
 * @Author LengWJ
 * @Date 2019/3/3  8:58
 * @Version 1.0
 */
@Entity
@Table(name="tb_RepayPlan2PA")
public class RepayPlan2PAOutDTO implements Serializable {

    /**
     *  主键
     */
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    /**
     * 1.借据号
     */
    @Column(name="loanNo",nullable=false)
    private String loanNo;

    /**
     * 2.本期状态标志
     */
    @Column(name="curTermStatus",nullable=false)
    private String curTermStatus;

    /**
     * 3.本期期数
     */
    @Column(name="termNo",nullable=false)
    private String termNo;

    /**
     * 4.本期应还款日
     *              格式:yyyyMMdd
     */
    @Column(name="dueDate",nullable=false)
    private String dueDate;

    /**
     * 5.本期结清日期
     *              格式:YYYYMMDD
     */
    @Column(name="settleDate")
    private String settleDate;

    /**
     * 6.利率
     */
    @Column(name="intRate",nullable=false)
    private BigDecimal intRate;

    /**
     * 7.罚息利率
     */
    @Column(name="odIntRate",nullable=false)
    private BigDecimal odIntRate;

    /**
     * 8.总应还本金
     *              应还=已还+尚欠
     */
    @Column(name="dueCapital",nullable=false)
    private BigDecimal dueCapital;

    /**
     * 9.总应还利息
     *              应还=已还+尚欠
     */
    @Column(name="dueInt",nullable=false)
    private BigDecimal dueInt;

    /**
     * 10.总应还罚息(这里的罚息包含复利)
     *              应还=已还+尚欠
     */
    @Column(name="dueOInt",nullable=false)
    private BigDecimal dueOInt;

    /**
     * 11.尚欠本金
     *              尚欠=应还-已还
     */
    @Column(name="oweCapital",nullable=false)
    private BigDecimal oweCapital;

    /**
     * 12.尚欠利息
     *              尚欠=应还-已还
     */
    @Column(name="oweInt",nullable=false)
    private BigDecimal oweInt;

    /**
     * 13.尚欠罚息(这里的罚息包含复利)
     *              尚欠=应还-已还
     */
    @Column(name="oweOInt",nullable=false)
    private BigDecimal oweOInt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    public String getCurTermStatus() {
        return curTermStatus;
    }

    public void setCurTermStatus(String curTermStatus) {
        this.curTermStatus = curTermStatus;
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

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    public BigDecimal getIntRate() {
        return intRate;
    }

    public void setIntRate(BigDecimal intRate) {
        this.intRate = intRate;
    }

    public BigDecimal getOdIntRate() {
        return odIntRate;
    }

    public void setOdIntRate(BigDecimal odIntRate) {
        this.odIntRate = odIntRate;
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

    public BigDecimal getDueOInt() {
        return dueOInt;
    }

    public void setDueOInt(BigDecimal dueOInt) {
        this.dueOInt = dueOInt;
    }

    public BigDecimal getOweCapital() {
        return oweCapital;
    }

    public void setOweCapital(BigDecimal oweCapital) {
        this.oweCapital = oweCapital;
    }

    public BigDecimal getOweInt() {
        return oweInt;
    }

    public void setOweInt(BigDecimal oweInt) {
        this.oweInt = oweInt;
    }

    public BigDecimal getOweOInt() {
        return oweOInt;
    }

    public void setOweOInt(BigDecimal oweOInt) {
        this.oweOInt = oweOInt;
    }

    @Override
    public String toString() {
        return "RepayPlan2PAOutDTO{" +
                "id=" + id +
                ", loanNo='" + loanNo + '\'' +
                ", curTermStatus='" + curTermStatus + '\'' +
                ", termNo='" + termNo + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", settleDate='" + settleDate + '\'' +
                ", intRate=" + intRate +
                ", odIntRate=" + odIntRate +
                ", dueCapital=" + dueCapital +
                ", dueInt=" + dueInt +
                ", dueOInt=" + dueOInt +
                ", oweCapital=" + oweCapital +
                ", oweInt=" + oweInt +
                ", oweOInt=" + oweOInt +
                '}';
    }
}

