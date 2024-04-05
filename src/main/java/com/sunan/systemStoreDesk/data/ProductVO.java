package com.sunan.systemStoreDesk.data;

import com.sunan.systemStoreDesk.data.util.ValueObject;

public class ProductVO extends ValueObject{
    
    private String imgUrl;
    private String name;
    private double price;
    private String size;
    private int stock;
    
    public ProductVO() {}

    public ProductVO(String imgUrl, String name, double price, String size, int stock) {
        this.imgUrl = imgUrl;
        this.name = name;
        this.price = price;
        this.size = size;
        this.stock = stock;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return super.toString().substring(0, super.toString().length()-1) + ",\n"
        + "name: " + this.name + ",\n"
        + "price: " + this.price + ",\n"
        + "size: " + this.size + ",\n"
        + "stock: " + this.stock + "]";
    }
    

}
