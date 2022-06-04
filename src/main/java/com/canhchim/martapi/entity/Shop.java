package com.canhchim.martapi.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "shop")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "address_gps_longtitude")
    private Double addressGpsLongtitude;

    @Column(name = "address_gps_latitude")
    private Double addressGpsLatitude;

    @Column(name = "address_national", length = 100)
    private String addressNational;

    @Column(name = "address_province_city", length = 100)
    private String addressProvinceCity;

    @Column(name = "address_district", length = 100)
    private String addressDistrict;

    @Column(name = "address_wards", length = 100)
    private String addressWards;

    @Column(name = "address_street", nullable = false, length = 50)
    private String addressStreet;

    @Column(name = "address_national_code", length = 50)
    private String addressNationalCode;

    @Column(name = "address_full", nullable = false, length = 50)
    private String addressFull;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "date_time_1")
    private Instant dateTime1;

    @Column(name = "date_time_2")
    private Instant dateTime2;

    @Column(name = "rsa_private", length = 512)
    private String rsaPrivate;

    @Column(name = "sra_public", length = 1024)
    private String sraPublic;

    @Column(name = "key_salt", length = 12)
    private String keySalt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAddressGpsLongtitude() {
        return addressGpsLongtitude;
    }

    public void setAddressGpsLongtitude(Double addressGpsLongtitude) {
        this.addressGpsLongtitude = addressGpsLongtitude;
    }

    public Double getAddressGpsLatitude() {
        return addressGpsLatitude;
    }

    public void setAddressGpsLatitude(Double addressGpsLatitude) {
        this.addressGpsLatitude = addressGpsLatitude;
    }

    public String getAddressNational() {
        return addressNational;
    }

    public void setAddressNational(String addressNational) {
        this.addressNational = addressNational;
    }

    public String getAddressProvinceCity() {
        return addressProvinceCity;
    }

    public void setAddressProvinceCity(String addressProvinceCity) {
        this.addressProvinceCity = addressProvinceCity;
    }

    public String getAddressDistrict() {
        return addressDistrict;
    }

    public void setAddressDistrict(String addressDistrict) {
        this.addressDistrict = addressDistrict;
    }

    public String getAddressWards() {
        return addressWards;
    }

    public void setAddressWards(String addressWards) {
        this.addressWards = addressWards;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressNationalCode() {
        return addressNationalCode;
    }

    public void setAddressNationalCode(String addressNationalCode) {
        this.addressNationalCode = addressNationalCode;
    }

    public String getAddressFull() {
        return addressFull;
    }

    public void setAddressFull(String addressFull) {
        this.addressFull = addressFull;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Instant getDateTime1() {
        return dateTime1;
    }

    public void setDateTime1(Instant dateTime1) {
        this.dateTime1 = dateTime1;
    }

    public Instant getDateTime2() {
        return dateTime2;
    }

    public void setDateTime2(Instant dateTime2) {
        this.dateTime2 = dateTime2;
    }

    public String getRsaPrivate() {
        return rsaPrivate;
    }

    public void setRsaPrivate(String rsaPrivate) {
        this.rsaPrivate = rsaPrivate;
    }

    public String getSraPublic() {
        return sraPublic;
    }

    public void setSraPublic(String sraPublic) {
        this.sraPublic = sraPublic;
    }

    public String getKeySalt() {
        return keySalt;
    }

    public void setKeySalt(String keySalt) {
        this.keySalt = keySalt;
    }

}