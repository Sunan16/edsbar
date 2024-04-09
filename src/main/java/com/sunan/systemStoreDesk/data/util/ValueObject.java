package com.sunan.systemStoreDesk.data.util;

import java.io.Serializable;

public abstract class ValueObject implements Serializable{
    
    private Long id;
    private String description;

    public ValueObject(){}

    public ValueObject(long id, String description){
        this.id = id;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
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
        ValueObject other = (ValueObject) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "[id: " + this.id + ",\n" + "description: " + this.description + "]";
    }

}
