package com.sunan.systemStoreDesk.data;

import com.sunan.systemStoreDesk.data.util.ValueObject;

public class CategoryVO extends ValueObject{
    
    private String name;

    public CategoryVO() {}

    public CategoryVO(long id, String description, String name) {
        super(id, description);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return super.toString().substring(0, super.toString().length()-1) + ",\n"
        + "name: " + this.name + "]";
    }

}
