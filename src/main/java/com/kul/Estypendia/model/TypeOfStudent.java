package com.kul.Estypendia.model;

import javax.persistence.*;
import java.util.List;

@Entity (name = "type_of_student")
public class TypeOfStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "monthly_payment", nullable = false)
    private Integer monthlyPayment;
    @Column(name = "description", nullable = false, length = 255)
    private String description;

    @OneToMany
    @JoinColumn(name = "type_of_student")
    private List<Student> students;

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
