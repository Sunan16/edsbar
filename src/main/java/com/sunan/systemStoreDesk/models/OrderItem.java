package com.sunan.systemStoreDesk.models;

import java.io.Serializable;

import com.sunan.systemStoreDesk.models.PK.OrderItemPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "orderItems")
public class OrderItem implements Serializable{

    @EmbeddedId
	private OrderItemPK id = new OrderItemPK();

    private Integer quantity;

    public OrderItemPK getId() {
        return id;
    }

    public void setId(OrderItemPK id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
