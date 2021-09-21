
package basicpractice;

import java.util.Scanner;


public class Squire {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter  the squre length");
        double num=input.nextDouble();
        double squreArea=num*num;
        System.out.println(" the area of squre is : "+ squreArea);
        
        double squrePerimeter=4*num;
        System.out.println("the perimeter of squre is : "+squrePerimeter);
        
        
    }
    
}
