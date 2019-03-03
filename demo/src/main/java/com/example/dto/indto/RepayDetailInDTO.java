package com.example.dto.indto; /**
 * 　* @Description: TODO
 * 　* @param ${tags}
 * 　* @return ${return_type}
 * 　* @throws
 * 　* @author lwj
 * 　* @date $date$ $time$
 */

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @Description TODO
 *
 * @Author LengWJ
 *
 * @Date 2019/3/3  12:54
 *
 * @Version 1.0
 */
public class RepayDetailInDTO implements Serializable {
    /**
     * 1.银行借据号
     */
    private String loanNo;
    /**
     * 2.还款日期
     *          格式：YYYYMMDD
     */
    private String tradeDate;
    /**
     * 3.扣款期数
     *          金额分配的对应期数，提前还款时传0
     */
    private String tradeTermNo;

    /**
     * 4.扣款总金额
     *          扣款本金+扣款利息及罚息
     */
    private BigDecimal tradeAmt;

    /**
     * 5.扣款本金
     *          该期数对应扣款本金（扣款成功时给入，失败时给0）
     */
    private BigDecimal tradeCapital;

    /**
     * 6.扣款利息
     *          该期数对应扣款利息
     */
    private BigDecimal tradeInt;

    /**
     * 7.扣款罚息
     *          该期数对应扣款罚息（如有复利，也计入罚息一并给合作方；扣款成功时给入，失败时给0）
     */
    private BigDecimal tradeOInt;

    /**
     * 8.还款交易类型
     *          0 正常还款
     *          1 提前还款
     *          2 预期还款
     */
    private String tradeType;

    /**
     * 9.扣款结果
     *          S：成功，E：失败
     */
    private String status;

    /**
     * 10.如扣款失败，失败原因
     */
    private String reason;

    /**
     * 11.合作方报盘流水号
     *             就是RepayResult、PrePayResult中的同名字段，以便于普惠把回盘数据跟报盘数据的对应关系
     */
    private String tradeSeqNo;

    public String getTradeTermNo() {
        return tradeTermNo;
    }

    public void setTradeTermNo(String tradeTermNo) {
        this.tradeTermNo = tradeTermNo;
    }
}
