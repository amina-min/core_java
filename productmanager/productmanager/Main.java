package com.productmanager;

import com.productmanager.Service.ReadWriteService;
import com.productmanager.Service.ReadWriteServiceImplementation;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product(101, "Laptop", 58000, 3, "");

        ReadWriteService r = new ReadWriteServiceImplementation();
        r.write(product1);

        Product readpro = r.read();
        String sep = ("--------------------------------------------");
        System.out.println(sep);
        String heading  = String.format("%-10s%-10s%-10s%-10s","ID","NAME","PRICE","QUANTITY");
        System.out.println(heading);
        System.out.println(readpro.toString());
        System.out.println(sep);

    }
}
