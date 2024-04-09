package com.sunan.systemStoreDesk.data;

import java.util.Date;

import com.sunan.systemStoreDesk.data.util.ValueObject;

public class PaymentVO extends ValueObject {
    
    private Long order;
    private Boolean made;
    private Date moment;
    
    public PaymentVO() {}

    public PaymentVO(Long id, String description, Long order, Boolean made, Date moment) {
        super(id, description);
        this.order = order;
        this.made = made;
        this.moment = moment;
    }

    public Long getIdOrder() {
        return order;
    }

    public void setIdOrder(Long order) {
        this.order = order;
    }

    public Boolean getMade() {
        return made;
    }

    public void setMade(Boolean made) {
        this.made = made;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }
    
    @Override
    public String toString() {
        return super.toString().substring(0, super.toString().length()-1) + ",\n"
        + "order: " + this.order + ",\n"
        + "made: " + this.made + ",\n"
        + "moment: " + this.moment + "]";
    }

}
