package com.example.dto.outdto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


/**
 * 　@Description: 审批过程中获取银行的还款计划展示给借款人
 * 　@date 2019-2-27
 *
 */
@Entity
@Table(name="tb_RepayPlanTrial")
public class RepayPlanTrialOutDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    /**
     * 返回状态
     */
    @Column(name="retCode",nullable=false)
    private String retCode;

    /**
     * 返回信息
     */
    @Column(name="retMsg",nullable=false)
    private String retMsg;

    //请求响应报文
    @Column(name="infoContent",nullable=false,columnDefinition="text")
    private String infoContent;

    @Column(name="respCode",nullable=false)
    private String respCode;

    @Column(name="requestSeqNo",nullable=false)
    private String requestSeqNo;

    @OneToMany(cascade={CascadeType.PERSIST},targetEntity = RepayPlan.class)
    @JoinColumn(name = "repayPlanId")
    private Set<RepayPlan> resultList;

    @Column(name="respMsg",nullable=false)
    private String respMsg;

    @Column(name="infoSign",nullable=false)
    private String infoSign;

    @Column(name="bankCode",nullable=false)
    private String bankCode;

    @Column(name="productType",nullable=false)
    private String productType;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public String getInfoContent() {
        return infoContent;
    }

    public void setInfoContent(String infoContent) {
        this.infoContent = infoContent;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRequestSeqNo() {
        return requestSeqNo;
    }

    public void setRequestSeqNo(String requestSeqNo) {
        this.requestSeqNo = requestSeqNo;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
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


    public Set<RepayPlan> getResultList() {
        return resultList;
    }

    public void setResultList(Set<RepayPlan> resultList) {
        this.resultList = resultList;
    }
    @Override
    public String toString() {
        return "RepayPlanTrialOutDTO{" +
                "id=" + id +
                ", retCode='" + retCode + '\'' +
                ", retMsg='" + retMsg + '\'' +
                ", infoContent='" + infoContent + '\'' +
                ", respCode='" + respCode + '\'' +
                ", requestSeqNo='" + requestSeqNo + '\'' +
                ", resultList=" + resultList +
                ", respMsg='" + respMsg + '\'' +
                ", infoSign='" + infoSign + '\'' +
                ", bankCode='" + bankCode + '\'' +
                ", productType='" + productType + '\'' +
                '}';
    }

}
