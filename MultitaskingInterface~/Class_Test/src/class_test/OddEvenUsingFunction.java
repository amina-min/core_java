
package class_test;

import java.util.Scanner;
public class OddEvenUsingFunction {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a number to check odd or even ");
          int num=sc.nextInt();
          
           odd_even(num);
          
    }
    
    static void  odd_even(int num){
        if(num%2==0){
            System.out.println(num+ " is a even number");
        }else
            System.out.println(num+" is a odd number");
    
    }
  
    
}
