package com.sunan.systemStoreDesk.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Order_Entity")
public class Order{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "moment", nullable = false)
    private Date moment;

    @Column(name = "status", nullable = false)
    private Integer status;
    
    @Column(name = "value", nullable = false)
    private Double value;

    @ManyToOne
    private Client client;

    public Order() {}

    public Order(Date moment, Integer status, Double value) {
        this.moment = moment;
        this.status = status;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Date getMoment() {
        return moment;
    }

    public Integer getStatus() {
        return status;
    }

    public Double getValue() {
        return value;
    }
    
}
