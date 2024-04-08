package com.sunan.systemStoreDesk.data;

import java.util.Date;

import com.sunan.systemStoreDesk.data.util.ValueObject;

public class PaymentVO extends ValueObject {
    
    private Long idOrder;
    private Boolean made;
    private Date moment;
    
    public PaymentVO() {}

    public PaymentVO(long id, String description, Long idOrder, Boolean made, Date moment) {
        super(id, description);
        this.idOrder = idOrder;
        this.made = made;
        this.moment = moment;
    }

    public Long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
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
        + "idOrder: " + this.idOrder + ",\n"
        + "made: " + this.made + ",\n"
        + "moment: " + this.moment + "]";
    }

}
