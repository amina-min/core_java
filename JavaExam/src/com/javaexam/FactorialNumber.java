
package com.javaexam;

import java.util.Scanner;


public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to print factorial");
        int num=sc.nextInt();
        int fac=1;
         for (int i = 1; i <=num; i++) {
            fac*=i;
        }
        System.out.println("factiran num of "+num+" is "+ fac );
    }
}
