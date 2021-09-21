package class_test;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number to check wheater it is prime or not ");

        int num = input.nextInt();
        if (num < 2) {
            System.out.println(num + " is not Prime Number");
            System.exit(0);
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("This is not prime number");
                System.exit(0);
            }
        }

        System.out.println(num + " is a prime number");

    }

}
