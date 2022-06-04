package com.canhchim.martapi.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "productinput")
public class Productinput {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productinputId", nullable = false)
    private Integer id;

    @Column(name = "totalmoney", nullable = false, precision = 10)
    private BigDecimal totalmoney;

    @Column(name = "inputdate1", nullable = false, length = 10)
    private String inputdate1;

    @Column(name = "inputdate2", nullable = false, length = 10)
    private String inputdate2;

    @Column(name = "userinputid", nullable = false)
    private Integer userinputid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(BigDecimal totalmoney) {
        this.totalmoney = totalmoney;
    }

    public String getInputdate1() {
        return inputdate1;
    }

    public void setInputdate1(String inputdate1) {
        this.inputdate1 = inputdate1;
    }

    public String getInputdate2() {
        return inputdate2;
    }

    public void setInputdate2(String inputdate2) {
        this.inputdate2 = inputdate2;
    }

    public Integer getUserinputid() {
        return userinputid;
    }

    public void setUserinputid(Integer userinputid) {
        this.userinputid = userinputid;
    }

}