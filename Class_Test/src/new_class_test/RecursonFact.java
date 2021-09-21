package new_class_test;

import java.util.Scanner;

public class RecursonFact {
    public static void main(String[] args) {
        System.out.println(" enter a number");
        Scanner sc=new Scanner (System.in);        
        int num=sc.nextInt();         
        int result=fact( num);
        System.out.println("Factorial of "+ num+ " is "+result );
        
    }

    public static int fact(int num) {
        if (num == 1) {
            return 1;
        }
        return num*fact(num-1);
    }
}
