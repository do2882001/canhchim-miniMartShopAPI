package com.canhchim.martapi.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "productinputdetail")
public class Productinputdetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productinputdetailId", nullable = false)
    private Integer id;

    @Column(name = "productid", nullable = false)
    private Integer productid;

    @Column(name = "productofnumber", nullable = false)
    private Integer productofnumber;

    @Column(name = "productcost", nullable = false, precision = 10)
    private BigDecimal productcost;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getProductofnumber() {
        return productofnumber;
    }

    public void setProductofnumber(Integer productofnumber) {
        this.productofnumber = productofnumber;
    }

    public BigDecimal getProductcost() {
        return productcost;
    }

    public void setProductcost(BigDecimal productcost) {
        this.productcost = productcost;
    }

}