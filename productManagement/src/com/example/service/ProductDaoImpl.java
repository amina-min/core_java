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
                String sql = "INSERT INTO product values(?,?,?,?,?);";
                PreparedStatement pst = conn.prepareStatement(sql);
                
                pst.setInt(1, product.getId());
                pst.setString(2, product.getName());
                pst.setDouble(3, product.getPrice());
                pst.setInt(4, product.getQuantity());
                pst.setString(5, product.getDetails());
                int result = pst.executeUpdate();

                if (result > 0) {
                    System.out.println("Product inserted successfully");
                } else {
                    System.out.println("Product inserted failed");
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("Connection succssed");
        } else {
            System.out.println("Connection failed! please try later");
        }

    }
    
    // get
     @Override
    public Product getProduct(int id) {
        Product product = null;
        try {

            String s = "select * from product where productId =?";
            PreparedStatement pst = conn.prepareStatement(s);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            rs.next();

            int pId = rs.getInt(1);
            String pName = rs.getString(2);
            int pPrice = rs.getInt(3);
            int pQuantity = rs.getInt(4);
            String pDetails = rs.getString(5);
            product = new Product(pId, pName, pPrice, pQuantity, pDetails);

        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product;
    }
    

    // update
    @Override
    public void update(int id, Product product) {
        try {
            String sql = "update product set productName = ?, price = ?, qty = ?, remark = ?  where productId = ?";
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, product.getName());
            pst.setDouble(2, product.getPrice());
            pst.setInt(3, product.getQuantity());
            pst.setString(4, product.getDetails());
            pst.setInt(5, product.getId());
             int result=pst.executeUpdate();
            
            if (result > 0) {
                    System.out.println("employee update successfully");
                } else {
                    System.out.println("employee update failed");
                }

        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
   
    //delete
    @Override
    public void delete(int id) {
        try {
            String sql = "delete from product where productId = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            boolean result = pst.execute();
            if (result ==true) {
                    System.out.println("employee delete successfully");
                } else {
                    System.out.println("employee delete failed");
                }

        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    //show
    @Override
    public void showProducts() {
        try {
            String sql = "select * from product ";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet r = pst.executeQuery();
            while (r.next()) {
                int pId = r.getInt(1);
                String pName = r.getString(2);
                int pPrice = r.getInt(3);
                int pQty = r.getInt(4);
                String pDtils = r.getString(5);
                Product product = new Product(pId, pName, pPrice, pQty, pDtils);
                System.out.println("");
               System.out.println(product.toString());
                        

            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
