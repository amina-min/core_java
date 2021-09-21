package com.javaexam;

import java.util.Arrays;

public class TwoDimontionalArray {

    public static void main(String[] args) {

        int[][] bigArr = {
            {1,90, 91, 11, 44},
            {0, 10, 9, 9, 11},
            {3, 23, 21, 5, 20},
            {13, 4, 45, 66, 33},
            {11, 0, 1, 20, 56}
        };

        for (int[] arr : bigArr) {
            BubbleSort(arr);

            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }

    }

    private static void BubbleSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int large = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = large;
                }
            }
        }

    }
}
