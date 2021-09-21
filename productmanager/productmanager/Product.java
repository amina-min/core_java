package com.productmanager;

import java.io.Serializable;

public class Product implements Serializable {
    private long id;
    private String name;
    private int price;
    private int quantity;
    private String details;
    public Product() {
    }
    public Product(long id, String name, int price, int quantity, String details) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.details = details;
    }
    public long getId() {
        return id;
    }
    public Product setId(long id) {
        this.id = id;
        return this;
    }
    public String getName() {
        return name;
    }
    public Product setName(String name) {
        this.name = name;
        return this;
    }
    public int getPrice() {
        return price;
    }
    public Product setPrice(int price) {
        this.price = price;
        return this;
    }
    public int getQuantity() {
        return quantity;
    }
    public Product setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }
    public String getDetails() {
        return details;
    }
    public Product setDetails(String details) {
        this.details = details;
        return this;
    }
    public int getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {

        String s  = String.format("%-10s%-10s%-10s%-10s",id,name,price,quantity);


        return s;
    }
}