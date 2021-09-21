package com.file;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteFileUsingScanner {

    public static void main(String[] args) {

        String id, name;
        try {
            Formatter fileFormat = new Formatter("D:/amin/java/Class_Test/Person/Student.txt");

            Scanner sc = new Scanner(System.in);
            System.out.print("How many Student entry in your file ");
            int num = sc.nextInt();

            for (int i = 1; i <= num; i++) {
                System.out.print("type student id and name ");

                id = sc.next();
                name = sc.next();
                fileFormat.format("%s   %s\r\n", id, name);
            }

            fileFormat.close();

        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }

    }
}
