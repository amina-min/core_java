/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataOutputStream output = null;
        try {
            output = new DataOutputStream(new FileOutputStream("t.dat"));
            output.writeChar('j');
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaApplication23.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication23.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                output.close();
            } catch (IOException ex) {
                Logger.getLogger(JavaApplication23.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
