package com.example.dto.indto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 　@Description: 审批过程中获取银行的还款计划展示给借款人，输入参数
 * 　@date 2019-2-27
 *
 */
public class RepayPlanTrialInDTO implements Serializable {

    // 请求报文体
    private int id;
    private BigDecimal trxAmt;
    private String termNo;
    private String rpyMthd;
    private String intRate;
    private String payDay;
    private String openDate;

    //请求发送报文
    private String corporateCode;
    private String infoContent;
    private String requestSeqNo;
    private String interfaceId;
    private String infoSign;
    private String bankCode;
    private String productType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getTrxAmt() {
        return trxAmt;
    }

    public void setTrxAmt(BigDecimal trxAmt) {
        this.trxAmt = trxAmt;
    }

    public String getTermNo() {
        return termNo;
    }

    public void setTermNo(String termNo) {
        this.termNo = termNo;
    }

    public String getRpyMthd() {
        return rpyMthd;
    }

    public void setRpyMthd(String rpyMthd) {
        this.rpyMthd = rpyMthd;
    }

    public String getIntRate() {
        return intRate;
    }

    public void setIntRate(String intRate) {
        this.intRate = intRate;
    }

    public String getPayDay() {
        return payDay;
    }

    public void setPayDay(String payDay) {
        this.payDay = payDay;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getCorporateCode() {
        return corporateCode;
    }

    public void setCorporateCode(String corporateCode) {
        this.corporateCode = corporateCode;
    }

    public String getInfoContent() {
        return infoContent;
    }

    public void setInfoContent(String infoContent) {
        this.infoContent = infoContent;
    }

    public String getRequestSeqNo() {
        return requestSeqNo;
    }

    public void setRequestSeqNo(String requestSeqNo) {
        this.requestSeqNo = requestSeqNo;
    }

    public String getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(String interfaceId) {
        this.interfaceId = interfaceId;
    }

    public String getInfoSign() {
        return infoSign;
    }

    public void setInfoSign(String infoSign) {
        this.infoSign = infoSign;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
}
