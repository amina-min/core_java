/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop;

public class UsingConstractor1 {

    String name;
    int id;
    int phone;
    int roll;

    //default constractor
    UsingConstractor1() {

    }

    // 3 parimetterise constractor
    UsingConstractor1(String stName, int stId, int stPhone) {
        name = stName;
        id = stId;
        phone = stPhone;

    }

    // 4 parimetterise constractor
    UsingConstractor1(String stName, int stId, int stPhone, int stRoll) {
        name = stName;
        id = stId;
        phone = stPhone;
        roll = stRoll;

    }

    void showResult() {
        System.out.println("Id : " + id);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Roll: " + roll);
        System.out.println("\n");
    }

}
