package com.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWritterNewExample {

    public static void main(String[] args) {
        try {
            PrintWriter out = new PrintWriter("IDB Bisew");
            out.print("Programming is Fun");
            out.flush();
            FileReader in = new FileReader("IDB Bisew");
            int i = 0;
            while ((i = in.read()) != -1) {
                System.out.println((char) i);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
        } catch (IOException e) {

        }
    }
}
