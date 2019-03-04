package com.example.dto.outdto;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @Description TODO
 *
 * @Author LengWJ
 *
 * @Date 2019/3/4  10:11
 *
 * @Version 1.0
 */
@Entity
@Table(name="tb_RepayResult")
public class RepayResultOutDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    /**
     * 1.银行借据号
     *          该笔申请银行生成的对应借据号
     */
    @Column(name="loanNo",nullable=false)
    private String loanNo;

    /**
     * 2.还款日期
     *          格式:YYYYMMDD
     */
    @Column(name="tradeDate",nullable=false)
    private String tradeDate;

    /**
     * 3.还款总金额
     *          银行还款扣款总金额
     *
     */
    @Column(name="tradeAmt",nullable=false)
    private BigDecimal tradeAmt;

    /**
     * 4.扣款交易流水号
     *          合作方扣款交易流水号
     */
    @Column(name="tradeSeqNo",nullable=false)
    private String tradeSeqNo;

    /**
     * 5.借据当前标识
     *          0 正常还款
     *          2 逾期还款
     *          3 部分正常还款
     */
    @Column(name="tradeFlag",nullable=false)
    private String tradeFlag;

    /**
     * 6.扣款账户标识
     *          W 工作日账户
     *          H 节假日账户
     */
    @Column(name="tradeFlag",nullable=false)
    private String acctFlag;
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

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }

    public BigDecimal getTradeAmt() {
        return tradeAmt;
    }

    public void setTradeAmt(BigDecimal tradeAmt) {
        this.tradeAmt = tradeAmt;
    }

    public String getTradeSeqNo() {
        return tradeSeqNo;
    }

    public void setTradeSeqNo(String tradeSeqNo) {
        this.tradeSeqNo = tradeSeqNo;
    }

    public String getTradeFlag() {
        return tradeFlag;
    }

    public void setTradeFlag(String tradeFlag) {
        this.tradeFlag = tradeFlag;
    }

    public String getAcctFlag() {
        return acctFlag;
    }

    public void setAcctFlag(String acctFlag) {
        this.acctFlag = acctFlag;
    }
}
