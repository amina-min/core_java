/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import com.example.model.Product;

/**
 *
 * @author Adon
 */
public interface ProductDao {
    public void store (Product product);
    
    
    
    public void update(int id, Product product);

    
    public Product getProduct(int id);
    
    
    public void showProduct();
    
    
    
}