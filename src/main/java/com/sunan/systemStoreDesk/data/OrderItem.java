package com.sunan.systemStoreDesk.data;

public class OrderItem {
    
    private Long idProduct;
    private Long idOrder;
    private int quantity;

    public OrderItem(){}

    public OrderItem(Long idProduct, Long idOrder, int quantity) {
        this.idProduct = idProduct;
        this.idOrder = idOrder;
        this.quantity = quantity;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public Long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
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
        result = prime * result + ((idProduct == null) ? 0 : idProduct.hashCode());
        result = prime * result + ((idOrder == null) ? 0 : idOrder.hashCode());
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
        if (idProduct == null) {
            if (other.idProduct != null)
                return false;
        } else if (!idProduct.equals(other.idProduct))
            return false;
        if (idOrder == null) {
            if (other.idOrder != null)
                return false;
        } else if (!idOrder.equals(other.idOrder))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "[Order: " + this.idOrder + "\n"
        + "Product: " + this.idProduct + "\n"
        + "Quantity: " + this.quantity + "]";
    }

}
