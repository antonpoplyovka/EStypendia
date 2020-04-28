package com.kul.Estypendia.controller.DTO;

public class AdminReportDTORecord {
    private String surname;
    private Integer monthlyPayment;

    public AdminReportDTORecord(String surname, Integer monthlyPayment) {
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
}
