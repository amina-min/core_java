/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.model.Product;
import com.example.service.ProductDao;
import com.example.service.ProductDaoImpl;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        ProductDao productDao =  new ProductDaoImpl();
        
       /*
        Scanner sc =  new Scanner (System.in);
        
        
         System.out.println("Enter your product id");
        int id = sc.nextInt();
        
        System.out.print("Enter your product name");
        String name = sc.nextLine();
        
        System.out.print("Enter your product price");
        int price = sc.nextInt();
        
       
        System.out.print("Enter your product quantity");
        int quantity = sc.nextInt();
        
     
        System.out.print("Type your product remarks");
        String Remarks = sc.nextLine();
     
      
       
        
        Product product = new Product(id,name, price, quantity, Remarks);
 */
        Product product = new Product(23,"a", 1, 1, "e");
        //productDao.store(product);
        
        
        
        Product p = productDao.getProduct(23);
        p.setName("Keyboard");
        //p.setRemarks("A4tech");
        //p.setQuantity(12);
        productDao.update(23, p);
        
        productDao.showProduct();
        
        
        
      
        
        
        
        
      
        
    }

}
