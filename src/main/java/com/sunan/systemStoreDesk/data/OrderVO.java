package com.sunan.systemStoreDesk.data;

import java.util.Date;

import com.sunan.systemStoreDesk.data.enums.OrderStatus;
import com.sunan.systemStoreDesk.data.util.ValueObject;

public class OrderVO extends ValueObject{
    
    private Long idClient;
    private Date moment;
    private OrderStatus status;
    private Double value;

    public OrderVO() {}

    public OrderVO(long id, String description, Long idClient, Date moment, OrderStatus status, Double value) {
        super(id, description);
        this.idClient = idClient;
        this.moment = moment;
        this.status = status;
        this.value = value;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
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
