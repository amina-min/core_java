package service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import productmanagmnt.Product;

public class ReadWriteServiceImp implements ReadWriteService {

    String myFile = "read.txt";

    @Override
    public void write(Product p) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(myFile);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOutputStream);
            objOut.writeObject(p);
            objOut.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found ");
        } catch (IOException ex) {
            Logger.getLogger(ReadWriteServiceImp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public Product read() {
        Product p1 = new Product();
        try {
            FileInputStream fileInputStream = new FileInputStream(myFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            p1 = (Product) objectInputStream.readObject();
            objectInputStream.close();

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            System.out.println(" ========  ");
        } catch (ClassNotFoundException ex) {
            System.out.println(" ClassNotFoundException ");
        }

        return p1;
    }

}
