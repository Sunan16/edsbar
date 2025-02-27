package com.sunan.systemStoreDesk.models;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Orders")
public class Order implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "moment", nullable = false)
    private Date moment;

    @Column(name = "status", nullable = false)
    private Integer status;
    
    @Column(name = "value", nullable = false)
    private Double value;

    //Relationships

    @ManyToOne
    private Client client;

    @OneToOne(mappedBy = "order")
    private Payment payment;

    public Order() {}

    public Order(Long id, String description, String address, Date moment, Integer status, Double value, Client client,
            Payment payment) {
        this.id = id;
        this.description = description;
        this.address = address;
        this.moment = moment;
        this.status = status;
        this.value = value;
        this.client = client;
        this.payment = payment;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    
    
}
