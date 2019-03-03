package com.example.dto.indto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @Description 正常还款结果同步银行
 *
 * @Author LengWJ
 *
 * @Date 2019/3/3  12:48
 *
 * @Version 1.0
 */
public class RepayResultInDto implements Serializable {

    /**
     *  1.银行借据号
     */
    private String loanNo;

    /**
     * 2.还款日期
     *      格式:YYYYMMDD
     */
    private String tradeDate;

    /**
     * 3.还款总金额
     */
    private BigDecimal tradeAmt;

    /**
     * 4.扣款交易流水号
     */
    private String tradeSeqNo;

    /**
     * 5.借据当前标识
     *
     *      0 正常还款
     *      2 逾期
     *      3 部分正常还款
     */
    private String tradeFlag;

    /**
     * 6.扣款账户标识
     *      W：工作日账户；
     *      H：节假日账户；
     */
    private String acctFlag;

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
