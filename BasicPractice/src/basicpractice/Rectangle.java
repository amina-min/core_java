
package basicpractice;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter length");
        int len=in.nextInt();
         System.out.println("enter width");
        int wid=in.nextInt();
        
        int rectangleArea=len*wid;
        int rectanglePerimeter= 2*(len + wid);
        System.out.println("Area of Rectangle is : "+rectangleArea  );
        System.out.println(" perimeter of retgttangle is : "+rectanglePerimeter);
        
        
        
    }
}
