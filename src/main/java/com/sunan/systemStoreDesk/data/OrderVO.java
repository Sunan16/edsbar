package com.sunan.systemStoreDesk.data;

import java.util.Date;

import com.sunan.systemStoreDesk.data.enums.OrderStatus;
import com.sunan.systemStoreDesk.data.util.ValueObject;

public class OrderVO extends ValueObject{
    
    private Long idClient;
    private String address;
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
    
    
    @Override
    public String toString() {
        return super.toString().substring(0, super.toString().length()-1) + ",\n"
        + "idClient: " + this.idClient + ",\n"
        + "address: " + this.address + ",\n"
        + "moment: " + this.moment + ",\n"
        + "status: " + this.status + ",\n"
        + "value: " + this.value + "]";
    }

}
