package com.kul.Estypendia.model;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Column(name = "surname", nullable = false, length = 50)
    private String surname;
    @Column(name = "father_name", nullable = false, length = 50)
    private String fatherName;
    @Column(name = "place_of_birth", nullable = false, length = 50)
    private String placeOfBirth;
    @Column(name = "country_of_birth", nullable = false, length = 50)
    private String countryOfBirth;
    @Column(name = "nationality", nullable = false, length = 50)
    private String nationality;
    @Column(name = "nationality_of_birth", nullable = false, length = 50)
    private String nationalityOfBirth;




    private Integer addressOfResidence;

    private Integer actualAddress;
    private Integer addressType;

    public Integer getId() {
        return id;
    }

    private Integer typeOfStudent;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationalityOfBirth() {
        return nationalityOfBirth;
    }

    public void setNationalityOfBirth(String nationalityOfBirth) {
        this.nationalityOfBirth = nationalityOfBirth;
    }
    public Integer getAddressType() {
        return addressType;
    }

    public void setAddressType(Integer addressType) {
        this.addressType = addressType;
    }

    public Integer getTypeOfStudent() {
        return typeOfStudent;
    }

    public void setTypeOfStudent(Integer typeOfStudent) {
        this.typeOfStudent = typeOfStudent;
    }

    public Integer getAddressOfResidence() {
        return addressOfResidence;
    }

    public void setAddressOfResidence(Integer addressOfResidence) {
        this.addressOfResidence = addressOfResidence;
    }

    public Integer getActualAddress() {
        return actualAddress;
    }

    public void setActualAddress(Integer actualAddress) {
        this.actualAddress = actualAddress;
    }
    //    public Address getAddressOfResidence() {
//        return addressOfResidence;
//    }
//
//    public void setAddressOfResidence(Address addressOfResidence) {
//        this.addressOfResidence = addressOfResidence;
//    }
//
//    public Address getActualAddress() {
//        return actualAddress;
//    }
//
//    public void setActualAddress(Address actualAddress) {
//        this.actualAddress = actualAddress;
//    }

}
