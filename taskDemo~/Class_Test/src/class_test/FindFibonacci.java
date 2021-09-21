package class_test;

import java.util.Scanner;

public class FindFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num to find fibonacci");
        int num = sc.nextInt();

        int f1 = 0, f2 = 1, f3;

        for (int i = 0; i < num; i++) {
            f3 = f1 + f2;
            System.out.println(f3);
            f1 = f2;
            f2 = f3;
        }

    }

}
