package com.example.model;

import java.io.Serializable;

public class Product implements Serializable {

    int id;
    String name;
    int price;
    int quantity;
    String details;

    public Product() {
    }

    public Product(int id, String name, int price, int quantity, String details) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", details=" + details + '}';
    }

}
