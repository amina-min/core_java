package com.example.service;

import com.example.model.Product;

public interface ProductDao {

    public void store(Product product);

    public void update(int id, Product pintroduct);

    public Product getProduct(int id);

    public void delete(int id);
    
    public void showProducts();

}
