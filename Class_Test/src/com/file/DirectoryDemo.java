
package com.file;

import java.io.File;


public class DirectoryDemo {
    public static void main(String[] args) {
        // create directory
        File dir1= new File("Person");
         dir1.mkdir();                       // create directory         
         File dir2= new File("D:\\amin\\java\\class");
        dir2.mkdir();                        // create directory                
        String path1=dir1.getAbsolutePath();//directory or folder location path
         String path2=dir2.getAbsolutePath();
        System.out.println(path1);
         System.out.println(path2);
         
         String name1=dir1.getName();
         String name2=dir2.getName();
         
         System.out.println(name1);
          System.out.println(name2);
          
          System.out.println("Delete directory :" +dir2.delete());
    }
}
