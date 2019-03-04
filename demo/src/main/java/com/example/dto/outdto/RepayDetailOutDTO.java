package com.example.dto.outdto;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @Description 银行扣款结果明细，返回数据
 *
 * @Author LengWJ
 *
 * @Date 2019/3/3  12:54
 *
 * @Version 1.0
 */
@Entity
@Table(name="tb_RepayDetail")
public class RepayDetailOutDTO implements Serializable {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    /**
     * 1.银行借据号
     */
    @Column(name="loanNo",nullable=false)
    private String loanNo;
    /**
     * 2.还款日期
     *          格式：YYYYMMDD
     */
    @Column(name="tradeDate",nullable=false)
    private String tradeDate;
    /**
     * 3.扣款期数
     *          金额分配的对应期数，提前还款时传0
     */
    @Column(name="tradeTermNo",nullable=false)
    private String tradeTermNo;

    /**
     * 4.扣款总金额
     *          扣款本金+扣款利息及罚息
     */
    @Column(name="tradeAmt",nullable=false)
    private BigDecimal tradeAmt;

    /**
     * 5.扣款本金
     *          该期数对应扣款本金（扣款成功时给入，失败时给0）
     */
    @Column(name="tradeCapital",nullable=false)
    private BigDecimal tradeCapital;

    /**
     * 6.扣款利息
     *          该期数对应扣款利息
     */
    @Column(name="tradeInt",nullable=false)
    private BigDecimal tradeInt;

    /**
     * 7.扣款罚息
     *          该期数对应扣款罚息（如有复利，也计入罚息一并给合作方；扣款成功时给入，失败时给0）
     */
    @Column(name="tradeOInt",nullable=false)
    private BigDecimal tradeOInt;

    /**
     * 8.还款交易类型
     *          0 正常还款
     *          1 提前还款
     *          2 预期还款
     */
    @Column(name="tradeType",nullable=false)
    private String tradeType;

    /**
     * 9.扣款结果
     *          S：成功，E：失败
     */
    @Column(name="status",nullable=false)
    private String status;

    /**
     * 10.如扣款失败，失败原因
     */
    @Column(name="reason",nullable=false)
    private String reason;

    /**
     * 11.合作方报盘流水号
     *             就是RepayResult、PrePayResult中的同名字段，以便于普惠把回盘数据跟报盘数据的对应关系
     */
    @Column(name="tradeSeqNo",nullable=false)
    private String tradeSeqNo;

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

    public String getTradeTermNo() {
        return tradeTermNo;
    }

    public void setTradeTermNo(String tradeTermNo) {
        this.tradeTermNo = tradeTermNo;
    }

    public BigDecimal getTradeAmt() {
        return tradeAmt;
    }

    public void setTradeAmt(BigDecimal tradeAmt) {
        this.tradeAmt = tradeAmt;
    }

    public BigDecimal getTradeCapital() {
        return tradeCapital;
    }

    public void setTradeCapital(BigDecimal tradeCapital) {
        this.tradeCapital = tradeCapital;
    }

    public BigDecimal getTradeInt() {
        return tradeInt;
    }

    public void setTradeInt(BigDecimal tradeInt) {
        this.tradeInt = tradeInt;
    }

    public BigDecimal getTradeOInt() {
        return tradeOInt;
    }

    public void setTradeOInt(BigDecimal tradeOInt) {
        this.tradeOInt = tradeOInt;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getTradeSeqNo() {
        return tradeSeqNo;
    }

    public void setTradeSeqNo(String tradeSeqNo) {
        this.tradeSeqNo = tradeSeqNo;
    }

    @Override
    public String toString() {
        return "RepayDetailOutDTO{" +
                "id=" + id +
                ", loanNo='" + loanNo + '\'' +
                ", tradeDate='" + tradeDate + '\'' +
                ", tradeTermNo='" + tradeTermNo + '\'' +
                ", tradeAmt=" + tradeAmt +
                ", tradeCapital=" + tradeCapital +
                ", tradeInt=" + tradeInt +
                ", tradeOInt=" + tradeOInt +
                ", tradeType='" + tradeType + '\'' +
                ", status='" + status + '\'' +
                ", reason='" + reason + '\'' +
                ", tradeSeqNo='" + tradeSeqNo + '\'' +
                '}';
    }
}
