
package basicpractice;

import java.util.Scanner;

public class VowelConsDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two num ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        
        int large =(num1>num2) ? num1 : num2;
        
            System.out.println("result is : "+ large);
    }
}
