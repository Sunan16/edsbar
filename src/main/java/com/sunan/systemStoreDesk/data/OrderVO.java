package com.sunan.systemStoreDesk.data;

import java.util.Date;

import com.sunan.systemStoreDesk.data.enums.OrderStatus;
import com.sunan.systemStoreDesk.data.util.ValueObject;

public class OrderVO extends ValueObject{
    
    private Date moment;
    private OrderStatus status;
    private Double value;

    public OrderVO() {}

    public OrderVO(long id, String description, Date moment, OrderStatus status, Double value) {
        super(id, description);
        this.moment = moment;
        this.status = status;
        this.value = value;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
    
}
