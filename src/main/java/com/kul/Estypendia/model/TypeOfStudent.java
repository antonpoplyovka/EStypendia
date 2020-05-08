package com.kul.Estypendia.model;

import javax.persistence.*;

@Entity (name = "type_of_student")
public class TypeOfStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "monthly_payment", nullable = false)
    private Integer monthlyPayment;
    @Column(name = "description", nullable = false, length = 255)
    private String description;

     public TypeOfStudent() {
    }

    public Integer getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(Integer monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
