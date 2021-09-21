
package Compute2nd;

import java.util.Scanner;

public class ComputeAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number ");
        int num1 = sc.nextInt();
        System.out.println(" Enter the number ");
        int num2 = sc.nextInt();
        System.out.println(" Enter the number ");
        int num3 = sc.nextInt();

        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average oj "+num1 +" "+ num2+ " "+num3 +" is "+ average);

    }

}
