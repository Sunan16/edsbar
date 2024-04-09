package com.sunan.systemStoreDesk.data;

import java.util.Date;

import com.sunan.systemStoreDesk.data.enums.OrderStatus;
import com.sunan.systemStoreDesk.data.util.ValueObject;

public class OrderVO extends ValueObject{
    
    private Long client;
    private String address;
    private Date moment;
    private OrderStatus status;
    private Double value;

    public OrderVO() {}

    public OrderVO(long id, String description, Long client, Date moment, OrderStatus status, Double value) {
        super(id, description);
        this.client = client;
        this.moment = moment;
        this.status = status;
        this.value = value;
    }

    public Long getIdClient() {
        return client;
    }

    public void setIdClient(Long client) {
        this.client = client;
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
    
    
    @Override
    public String toString() {
        return super.toString().substring(0, super.toString().length()-1) + ",\n"
        + "client: " + this.client + ",\n"
        + "address: " + this.address + ",\n"
        + "moment: " + this.moment + ",\n"
        + "status: " + this.status + ",\n"
        + "value: " + this.value + "]";
    }

}
