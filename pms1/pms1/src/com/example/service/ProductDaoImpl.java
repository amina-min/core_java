/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import com.example.DatabaseConnector;
import com.example.model.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductDaoImpl implements ProductDao {
    Connection conn = DatabaseConnector.connect();
    
    @Override
    public void store(Product product) {
      
        if (conn != null) {

           
            try {
                String sql = "INSERT INTO products values(?,?,?,?,?);";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setInt(1, product.getId());
                pst.setString(2, product.getName());
                pst.setDouble(3, product.getPrice());
                pst.setInt(4, product.getQuantity());
                pst.setString(5, product.getRemarks());
                int result = pst.executeUpdate();
                
                
                

                if (result > 0) {
                    System.out.println("Product inserted successfully");
                } else {
                    System.out.println("Product inserted failed");
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("Connection succdded");
        } else {
            System.out.println("Connection failed! please try later");
        }
      
    }

    @Override
    public void update(int id, Product product) {
        try {
            String sql = "update products set name = ?, price = ?, quantity = ?, remark = ?  where id = ?" ;
            PreparedStatement pst = conn.prepareStatement(sql);
         
                pst.setString(1, product.getName());
                pst.setDouble(2, product.getPrice());
                pst.setInt(3, product.getQuantity());
                pst.setString(4, product.getRemarks());
                pst.setInt(5, product.getId());
                 pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public Product getProduct(int id) {
        Product product = null;
        try {
            
            String s = "select * from products where id =?";
            PreparedStatement pst = conn.prepareStatement(s);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            rs.next();
            
            
            
            int pid = rs.getInt(1);
            String pname = rs.getString(2);
            int pPrice = rs.getInt(3);
            int pQuantity = rs.getInt(4);
            String pRemark = rs.getString(5);
            product = new Product(pid, pname, pPrice, pQuantity, pRemark);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product;
    }

    @Override
    public void showProduct() {
       try {
            
            String s = "select * from products";
            PreparedStatement pst = conn.prepareStatement(s);
            
            ResultSet rs = pst.executeQuery();
           
            while(rs.next()){
                int pid = rs.getInt(1);
            String pname = rs.getString(2);
            int pPrice = rs.getInt(3);
            int pQuantity = rs.getInt(4);
            String pRemark = rs.getString(5);
           
            Product product = new Product(pid, pname, pPrice, pQuantity, pRemark);
                System.out.println(product.toString());
            
            }
            
            
           
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }

   
   
}