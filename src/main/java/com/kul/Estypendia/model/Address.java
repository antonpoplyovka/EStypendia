package com.kul.Estypendia.model;

import javax.persistence.*;

@Entity(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;



    private boolean actualAddress;
    @Column(name = "code", nullable = false, length = 10)
    private String code;
    @Column(name = "street", nullable = false, length = 50)
    private String street;
    @Column(name = "district", nullable = false, length = 50)
    private String district;
    @Column(name = "voivodeship", nullable = false, length = 50)
    private String voivodeship;
    @Column(name = "city", nullable = false, length = 50)
    private String city;
    @Column(name = "country", nullable = false, length = 50)
    private String country;
    @Column(name = "phone", nullable = false, length = 50)
    private String phone;
    @Column(name = "house_number", nullable = false, length = 50)
    private String houseNumber;
    @Column(name = "flat_number", nullable = false, length = 50)
    private String flatNumber;









    public Address() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isActualAddress() {
        return actualAddress;
    }

    public void setActualAddress(boolean actualAddress) {
        this.actualAddress = actualAddress;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getVoivodeship() {
        return voivodeship;
    }

    public void setVoivodeship(String voivodeship) {
        this.voivodeship = voivodeship;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }



}
