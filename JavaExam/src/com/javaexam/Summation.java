
package com.javaexam;

import java.util.Scanner;


public class Summation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        int sum=0;
        while (i!=-1) {
            sum+=i;
            System.out.println("enter a value");
            i=sc.nextInt();
            
        }
        System.out.println(""
                + " total = "+sum);
    }
}
