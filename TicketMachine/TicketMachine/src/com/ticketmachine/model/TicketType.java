
package com.ticketmachine.model;

import java.io.Serializable;

public class TicketType implements Serializable{
    private long id;
    private String type;

    public TicketType(long id, String type) {
        this.id = id;
        this.type = type;
    }
        

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TicketType{" + "id=" + id + ", type=" + type + '}';
    }
    
    

}
