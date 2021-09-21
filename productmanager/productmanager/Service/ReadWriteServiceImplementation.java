package com.productmanager.Service;

import com.productmanager.Product;

import java.io.*;

public class ReadWriteServiceImplementation implements ReadWriteService {
    String fname = "product.data";

    @Override
    public void write(Product p) {
        try {
            ObjectOutputStream objout =
                    new ObjectOutputStream(new FileOutputStream(fname));
            objout.writeObject(p);

            objout.flush();
            objout.writeUTF("sakib utf");
            objout.close();

        } catch (FileNotFoundException f) {
            System.out.println("File pawa jaini");
        } catch (IOException e) {
            System.out.println("io exception");
        }
    }

    @Override
    public Product read() {
        Product product = new Product();
        try {
            ObjectInputStream objin = new ObjectInputStream(new FileInputStream(fname));
            product = (Product) objin.readObject();


            System.out.println(objin.readUTF());


            objin.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Io exc");
        }
        return product;
    }
}