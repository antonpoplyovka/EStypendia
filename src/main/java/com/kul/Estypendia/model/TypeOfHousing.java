package com.kul.Estypendia.model;

import javax.persistence.*;

@Entity (name = "type_of_housing")
public class TypeOfHousing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "cost", nullable = false)
    private Integer cost;
    @Column(name = "description", length = 255)
    private String description;





    public TypeOfHousing() {
    }

    public Integer getId() {
        return id;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
