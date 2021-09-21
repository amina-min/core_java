package exceptionhandling;

import java.util.Scanner;

public class ExceptionPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter two integer");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        try {
           int result=quotient(num1,num2);
            System.out.println(" Result ="+ result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }

    public static int quotient(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException(" Divisior cannot be zero ");
        }

        return num1 / num2;

    }

}
