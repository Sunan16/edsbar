package com.sunan.systemStoreDesk.data;

public class OrderItem {
    
    private Long product;
    private Long order;
    private int quantity;

    public OrderItem(){}

    public OrderItem(Long product, Long order, int quantity) {
        this.product = product;
        this.order = order;
        this.quantity = quantity;
    }

    public Long getIdProduct() {
        return product;
    }

    public void setIdProduct(Long product) {
        this.product = product;
    }

    public Long getIdOrder() {
        return order;
    }

    public void setIdOrder(Long order) {
        this.order = order;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((product == null) ? 0 : product.hashCode());
        result = prime * result + ((order == null) ? 0 : order.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrderItem other = (OrderItem) obj;
        if (product == null) {
            if (other.product != null)
                return false;
        } else if (!product.equals(other.product))
            return false;
        if (order == null) {
            if (other.order != null)
                return false;
        } else if (!order.equals(other.order))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "[Order: " + this.order + "\n"
        + "Product: " + this.product + "\n"
        + "Quantity: " + this.quantity + "]";
    }

}
