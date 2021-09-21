
package basicpractice;

import java.util.Scanner;


public class Circle {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        System.out.println("Enter  the redius");
        
       double r=input.nextDouble();
       double pi=3.1416;
       double area= pi*r*r;
       double perimeter=2*pi*r;
        System.out.println("area= "+area);
        System.out.println("perimeter= "+perimeter);
       
       
    }
     
}
