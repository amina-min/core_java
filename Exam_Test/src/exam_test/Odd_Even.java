package exam_test;

import java.util.Scanner;

public class Odd_Even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check odd or even");
        int num = sc.nextInt();
        oddEven(num);

    }

    static void oddEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is a even number");
        } else {
            System.out.println(num + " Its a odd number");
        }
    }

}
