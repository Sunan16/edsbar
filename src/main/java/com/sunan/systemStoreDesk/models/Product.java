package com.sunan.systemStoreDesk.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Products")
public class Product implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "img")
    private String imgUrl;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "priority", nullable = false)
    private int priority;

    @Column(name = "size", nullable = false)
    private String size;

    @Column(name = "stock", nullable = false)
    private int stock;

    // Relationships

    @ManyToOne
    private Category category;

    public Product(){}
    
    public Product(Long id, String description, String imgUrl, String name, double price, int stock) {
        this.id = id;
        this.description = description;
        this.imgUrl = imgUrl;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public int getStock() {
        return stock;
    }

}
