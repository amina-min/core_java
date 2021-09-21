package com.javaexam;

import java.util.Scanner;

public class FindLowestHighest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter four number and find lowest and heighest from them");
        int[] arr = new int[4];

        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

        }
        System.out.println("The lowest value is " + min);

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        System.out.println("The heighest value is " + max);

    }
}
