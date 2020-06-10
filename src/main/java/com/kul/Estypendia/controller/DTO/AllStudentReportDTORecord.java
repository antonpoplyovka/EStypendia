package com.kul.Estypendia.controller.DTO;

public class AllStudentReportDTORecord {
    private String name;
    private String surname;
    private Integer paymentAmount;
    private String paymentDate;

    public AllStudentReportDTORecord(String name, String surname, Integer paymentAmount, String paymentDate ) {

        this.name = name;
        this.surname = surname;
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
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

    public Integer getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Integer paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }
}
