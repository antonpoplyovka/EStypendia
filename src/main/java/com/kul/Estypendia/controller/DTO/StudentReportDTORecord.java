package com.kul.Estypendia.controller.DTO;

import java.time.Instant;

public class StudentReportDTORecord {
    private Integer paymentAmount;
    private Instant paymentDate;

    public StudentReportDTORecord( Integer paymentAmount, Instant paymentDate) {
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }

    public void setPaymentAmount(Integer paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Instant getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Instant paymentDate) {
        this.paymentDate = paymentDate;
    }
}
