package com.kul.Estypendia.controller.DTO;


import java.time.LocalDate;

public class StudentReportDTORecord {
    private Integer paymentAmount;
    private String paymentDate;

    public StudentReportDTORecord( Integer paymentAmount, LocalDate paymentDate) {
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate.toString();
    }

    public void setPaymentAmount(Integer paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Integer getPaymentAmount() {
        return paymentAmount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }
}
