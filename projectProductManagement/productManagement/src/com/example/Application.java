package com.example;

import com.example.model.Product;
import com.example.service.ProductDao;
import com.example.service.ProductDaoImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mysql.cj.jdbc.Driver;


public class Application {

    public static void main(String[] args) {

         Product band = new Product(28, "mi band 3", 3000, 1, "onek din gelo");
         
         ProductDao dao = new ProductDaoImpl();
        dao.store(band);
        

    }

}
