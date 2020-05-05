package com.kul.Estypendia.controller.DTO;

public class AdminReportDTORecord {
    private String surname;
    private String name;
    private Integer monthlyPayment;

    public AdminReportDTORecord(String surname, String name, Integer monthlyPayment) {
        this.name = name;
        this.surname = surname;
        this.monthlyPayment = monthlyPayment;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(Integer monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
