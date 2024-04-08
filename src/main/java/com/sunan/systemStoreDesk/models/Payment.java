package com.sunan.systemStoreDesk.models;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "payments")
public class Payment implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "made", nullable = false)
    private Boolean made;

    @Column(name = "moment", nullable = false)
    private Date moment;

    // Relationships

    @OneToOne
    private Order order;

    public Payment() {}

    public Payment(Long id, String description, Boolean made, Date moment) {
        this.id = id;
        this.description = description;
        this.made = made;
        this.moment = moment;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getMade() {
        return made;
    }

    public Date getMoment() {
        return moment;
    }

}
