
package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnector {
    public static Connection connect(){
                
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pms47", "root", "123456");
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
