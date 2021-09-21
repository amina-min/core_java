
package basicpractice;

import java.util.Scanner;


public class CapitalSmall {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter any letter ");
        
        char ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("Small later");
        }else if(ch>='A' && ch<='Z'){
            System.out.println("capital later");
        }else
            System.out.println(" not a later ");
    }
}
