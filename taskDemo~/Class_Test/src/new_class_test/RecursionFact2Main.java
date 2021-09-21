
package new_class_test;

import java.util.Scanner;


public class RecursionFact2Main {
    public static void main(String[] args) {
        System.out.println("Enter a num");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        RecursionFact2 ob=new RecursionFact2();
       int result= ob.fact(num);
        System.out.println("Factorial of "+ num+ " is "+result);
        
    }
}
