
package com.file;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileDemo2 {
    public static void main(String[] args) {
        try {
            Formatter fileFormat=new Formatter("D:/amin/java/Class_Test/Person/teacher.txt");
            fileFormat.format("%s %s \r\n" , " 101 " , " Amina ");
            fileFormat.format("%s %s \r\n" , " 102 " , " Rima ");
             fileFormat.format("%s %s \r\n" , " 103 " , " Alpana ");
              fileFormat.format("%s %s \r\n" , " 104 " , " Popy ");
               fileFormat.format("%s %s \r\n" , " 105 " , " Amina ");
            
            fileFormat.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
