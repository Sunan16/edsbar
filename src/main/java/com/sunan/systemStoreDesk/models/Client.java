package com.sunan.systemStoreDesk.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Clients")
public class Client {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "phone", nullable = false, unique = true)
    private String phone;

    // Relationships
    
    @JsonIgnore
    @OneToMany(mappedBy = "client")
	private List<Order> orders = new ArrayList<>();

    public Client(){}

    public Client(Long id, String description, String address, String name, String phone) {
        this.id = id;
        this.description = description;
        this.address = address;
        this.name = name;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

}
