package com.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {

    public static void main(String[] args) {

        try {
            PrintWriter out = new PrintWriter("temp.nclc");
            out.print("Hello I/O");
            out.flush();
            FileReader in = new FileReader("temp.nclc");
            int ct1 = 0;
            while ((ct1 = in.read()) != -1) {
                System.out.println((char) ct1);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
        } catch (IOException e) {
           // System.out.println(e.getMessage);
        }

    }

}
