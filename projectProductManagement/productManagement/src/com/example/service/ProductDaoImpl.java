
package com.example.service;



import com.example.DatabaseConnector;
import java.io.*;
import com.example.model.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductDaoImpl implements ProductDao {

    
     @Override
    public boolean store(Product product) {
        
        
         try {
             Connection conn = DatabaseConnector.connect();
             
             if(conn == null) return false;
             
             String stmnt = "insert into product values(?,?,?,?,?)";
             PreparedStatement prestmnt = conn.prepareStatement(stmnt);
             
             prestmnt.setLong(1, product.getId());
             prestmnt.setString(2,product.getName());
             prestmnt.setDouble(3, product.getPrice());
             prestmnt.setInt(4, product.getQuantity());
             prestmnt.setString(5, product.getDetails());
             prestmnt.execute();
             return true;
         } catch (SQLException ex) {
             Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         return false;
    }
}
