package com.file;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileDemo {

    public static void main(String[] args) {
        File file1 = new File("D:/amin/java/Class_Test/Person/Teacher");
        File file2 = new File("D:/amin/java/Class_Test/Person/Student");
        //System.out.println(file2.getAbsolutePath());
        // System.out.println(file1.getAbsolutePath());
        
        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println(" Files are created ");
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        
        //file1.delete();
        //file2.delete();
        if (file1.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("file note exits");
        }
       
        if (file2.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("file note exits");
        }

    }
}
