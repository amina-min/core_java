package com.file;

import java.io.File;
import java.util.Scanner;

public class ReadeFile {

    public static void main(String[] args) {

        try {
            File file = new File("D:/amin/java/Class_Test/Person/Student.txt");
            Scanner sc = new Scanner(file);
            
            while(sc.hasNext()){
                String id=sc.next();
                String name=sc.next();
                System.out.println("Id: "+id+" Name: "+name);
            }
            sc.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
