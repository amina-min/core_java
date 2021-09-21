
package com.oop;

public class UsingMethod2 {

    int custId;
    String custName;
    String custAddress;

    void Customer(int id, String name, String address) {
        custId = id;
        custName = name;
        custAddress = address;

    }

    void CustCheck() {
        System.out.println("Id : " + custId);
        System.out.println("Name : " + custName);
        System.out.println("Address : " + custAddress);
        System.out.println("\n\n");
    }
}
