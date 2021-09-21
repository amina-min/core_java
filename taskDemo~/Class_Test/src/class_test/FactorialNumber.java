package class_test;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print Factirial");
        int num = sc.nextInt();

        int f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;

        }
        System.out.println(" The Factirial of " + num + " is " + f);

    }

}
