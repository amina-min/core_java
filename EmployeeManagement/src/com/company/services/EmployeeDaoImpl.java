package com.company.services;

import com.company.DatabaseConnector;
import com.company.model.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeDaoImpl implements EmployeeDao {

    Connection conn = DatabaseConnector.connect();

    @Override
    public void insert(Employee e) {

        if (conn != null) {
            try {
                String sqlSmt = " insert into employee values(?,?,?,?,?);";
                PreparedStatement pst = conn.prepareStatement(sqlSmt);
                pst.setInt(1, e.getId());
                pst.setString(2, e.getName());
                pst.setInt(3, e.getSalary());
                pst.setString(4, e.getDept_name());
                pst.setInt(5, e.getBonus());
                int insertResult = pst.executeUpdate();

                if (insertResult > 0) {
                    System.out.println("employee insert succellfully");
                } else {
                    System.out.println("employee insert fail");
                }

            } catch (SQLException ex) {
                Logger.getLogger(EmployeeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(" Successfully connected");

        } else {
            System.out.println("Connection fail");
        }
    }

    @Override
    public void update(Employee e) {
        if (conn != null) {
            try {
                String sqlSmt = "update employee set NAME =?, SALARY=?, DEPT_NAME=?, BONUS=? where ID=?";
                PreparedStatement pst = conn.prepareStatement(sqlSmt);
                
                pst.setString(1, e.getName());
                pst.setInt(2, e.getSalary());
                pst.setString(3, e.getDept_name());
                pst.setInt(4, e.getBonus());
                pst.setInt(5, e.getId());
                pst.executeUpdate();

            } catch (SQLException ex) {
                Logger.getLogger(EmployeeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(" Successfully connected");

        } else {
            System.out.println("Connection fail");
        }
    }

    
    @Override
    public Employee getEmployee(int id) {
        Employee e = null;
        try {

            String sqlSmt = "select * from employee where ID=?";
            PreparedStatement pst = conn.prepareStatement(sqlSmt);
            pst.setInt(1, id);
            ResultSet r = pst.executeQuery();
            r.next();
           

            int eid = r.getInt(1);
            String ename = r.getString(2);
            int eSal = r.getInt(3);
            String dept_name = r.getString(4);
            int bonus = r.getInt(5);
            e = new Employee(eid, ename, eSal, dept_name, bonus);

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return e;
    }

    @Override
    public void delete(int id) {
        if (conn != null) {
            try {
                String sqlSmt = "delete from employee where ID=? ";
                PreparedStatement pst = conn.prepareStatement(sqlSmt);
                pst.setInt(1, id);
                pst.execute();

            } catch (SQLException ex) {
                Logger.getLogger(EmployeeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(" Successfully connected");

        } else {
            System.out.println("Connection fail");
        }
    }

    @Override
    public void showEmployee() {
        if (conn != null) {
            try {
                String sqlSmt = "select * from employee";
                PreparedStatement pst = conn.prepareStatement(sqlSmt);
                ResultSet rs= pst.executeQuery();
                System.out.printf("%-20s%-20s%-20s%-20s%-20s\n","ID","NAME","SALARY","DEPT_NAME","BONUS");
                while(rs.next()){
                    int eid=rs.getInt(1);
                    String name=rs.getString(2);
                    int sal=rs.getInt(3);
                    String dept=rs.getString(4);
                    int bonus=rs.getInt(5);
                    Employee e=new Employee(eid,name,sal,dept,bonus);                    
                    String tostring = e.toString();
                     System.out.printf("%-20d%-20s%-20d%-20s%-20d\n",e.getId(),e.getName(),e.getSalary(),e.getDept_name(),e.getBonus());
                    //System.out.println(tostring);
                    
                }

            } catch (SQLException ex) {
                Logger.getLogger(EmployeeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(" Successfully connected");

        } else {
            System.out.println("Connection fail");
        }
    }
    
    

}
