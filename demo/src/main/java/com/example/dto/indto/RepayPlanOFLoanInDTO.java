package com.example.dto.indto;

import java.io.Serializable;

/**

/**
 * @ClassName RepayPlanOFLoanInDTO
 * @Description 放款后可通过该接口根据借据号实时获取当期及之后各期的还款计划
 * @Author LengWJ
 * @Date 2019/3/2  18:19
 * @Version 1.0
 */
public class RepayPlanOFLoanInDTO implements Serializable {

    /**
     *  借据号（银行生成的对应借据号）
     */
    private String loanNo;

    /**
     *  合作渠道 （合作渠道代码(InsureCompany) ，19-合作方）
     */
    private String qudLay;

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    public String getQudLay() {
        return qudLay;
    }

    public void setQudLay(String qudLay) {
        this.qudLay = qudLay;
    }

    @Override
    public String toString() {
        return "RepayPlanOFLoanInDTO{" +
                "loanNo='" + loanNo + '\'' +
                ", qudLay='" + qudLay + '\'' +
                '}';
    }
}
