
package com.javaexam;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FindMaxMin {
    public static void main(String[] args) {         
        System.out.println("Enter Up To 5 Numbers");
        Scanner sc=new Scanner(System.in);
        Integer[] numbers =new Integer[5];
 
        for (int i=0;i<numbers.length;i++)
        {
            System.out.print("enter numbers["+i+"+]:");
            numbers[i]=sc.nextInt();
        }
 
 
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));
 
        
 
        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);
    }
}
    

