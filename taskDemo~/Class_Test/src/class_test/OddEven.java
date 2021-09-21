package class_test;

import java.util.Scanner;

class OddEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number for check odd or even: ");
        int num = input.nextInt();
        
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is a even number");
            } else {
                System.out.println(i + " is a odd number");
            }
           

        }
       
    }
}
