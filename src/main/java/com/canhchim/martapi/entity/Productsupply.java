package com.canhchim.martapi.entity;

import javax.persistence.*;

@Entity
@Table(name = "productsupply")
public class Productsupply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplyid", nullable = false)
    private Integer id;

    @Column(name = "suppliesname", nullable = false, length = 100)
    private String suppliesname;

    @Column(name = "suppliesaddress", nullable = false, length = 100)
    private String suppliesaddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSuppliesname() {
        return suppliesname;
    }

    public void setSuppliesname(String suppliesname) {
        this.suppliesname = suppliesname;
    }

    public String getSuppliesaddress() {
        return suppliesaddress;
    }

    public void setSuppliesaddress(String suppliesaddress) {
        this.suppliesaddress = suppliesaddress;
    }

}