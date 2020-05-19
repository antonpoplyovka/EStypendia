package com.kul.Estypendia.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;

@Entity(name = "payments_log")
public class PaymentsLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "student_id", nullable = false)
    private BigInteger studentId;
    @Column(name = "payout_amount", nullable = false)
    private Integer paymentAmount;
    @Column(name = "payment_date", nullable = false)
    private LocalDate paymentDate;

    public PaymentsLog() {
    }

    public BigInteger getStudentId() {
        return studentId;
    }

    public void setStudentId(BigInteger studentId) {
        this.studentId = studentId;
    }

    public Integer getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Integer paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }
}
