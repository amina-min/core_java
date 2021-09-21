
package com.oop;


public class MethodTest2 {

    public static void main(String[] args) {
        
        UsingMethod2 cust1 = new UsingMethod2();
        cust1.Customer(001, "amina", "Dhaka");
        cust1.CustCheck();
        
         UsingMethod2 cust2 = new UsingMethod2();
        cust2.Customer(002, "Habiba", "Dhaka");
        cust2.CustCheck();
        
        /*
        // avabe o hobe akhetre call kora lagbena
        System.out.println("Id : " + cust1.custId);
        System.out.println("Name : " +cust1. custName);
        System.out.println("Address : " +cust1.custAddress);
        System.out.println("\n\n");
        */
    }
}
