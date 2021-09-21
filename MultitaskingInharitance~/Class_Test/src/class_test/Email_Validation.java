
package class_test;

import java.util.Scanner;
public class Email_Validation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a email to Check valid or invalid ");
        String email=sc.nextLine();
        
        String regEx="^([A-Za-z0-9]+)@([A-Za-z0-9]+)\\.([A-Za-z]{3})$"; 
        if(email.matches(regEx)){
            System.out.println("Valid email");
                
                
        }else
            System.out.println(" please Type the valid email");
        
    }
}
