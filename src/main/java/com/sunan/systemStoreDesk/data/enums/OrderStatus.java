package com.sunan.systemStoreDesk.data.enums;

import com.sunan.systemStoreDesk.exceptions.EnumException;

public enum OrderStatus {

    STARTED(0), SHIPPED(1), DELIVERED(2), CANCELED(3);

    private int status;

    private OrderStatus(int status){
        if(status < 0 || status > 3){
            throw new EnumException("Invalid value!");
        }
        this.status = status;
    }

    public int toInt(){
        return status;
    }

}
