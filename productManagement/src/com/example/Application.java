package com.example;

import com.example.model.Product;
import com.example.service.ProductDao;
import com.example.service.ProductDaoImpl;

public class Application {

    public static void main(String[] args) {

        Product band = new Product(200, "Books", 3000, 5, "Sirat_e_rasul");

        ProductDao dao = new ProductDaoImpl();

        //dao.store(band);
        
       
        Product p = dao.getProduct(203);
        p.setName("Monitor");
        dao.update(203, p);
         /*
       dao.delete(28);
       dao.showProducts();
        */
      
    }

}
