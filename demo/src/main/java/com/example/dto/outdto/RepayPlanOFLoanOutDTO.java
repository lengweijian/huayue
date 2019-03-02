package com.example.dto.outdto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * @ClassName RepayPlanOFLoanInDTO
 * @Description 放款后可通过该接口根据借据号实时获取当期及之后各期的还款计划
 * @Author LengWJ
 * @Date 2019/3/2  18:19
 * @Version 1.0
 */
@Entity
@Table(name="tb_RepayPlanOFLoan")
public class RepayPlanOFLoanOutDTO implements Serializable {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
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

    @OneToMany(cascade={CascadeType.PERSIST},targetEntity = Planlist.class)
    @JoinColumn(name = "planId")
    private Set<Planlist> planlist;

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

    public Set<Planlist> getPlanlist() {
        return planlist;
    }

    public void setPlanlist(Set<Planlist> planlist) {
        this.planlist = planlist;
    }

}
