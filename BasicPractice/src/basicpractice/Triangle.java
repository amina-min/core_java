
package basicpractice;

import java.util.Scanner;


public class Triangle {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        System.out.println("Enter  the base length");
        double num1=input.nextDouble();
        System.out.println("Enter  the height");
         double num2=input.nextDouble();
        
        double triangleArea=.5*num1*num2;
        double c = Math.sqrt((num1 * num1) + (num2 * num2));
        double trianglePerimeter=num1+num2+c;
        System.out.println(" the area of squre is : "+ triangleArea);
        System.out.println("the perimeter of Triangle is : "+trianglePerimeter);
    }
}
