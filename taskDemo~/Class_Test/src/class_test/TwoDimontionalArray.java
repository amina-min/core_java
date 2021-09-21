package class_test;

import java.util.Arrays;

public class TwoDimontionalArray {

    public static void main(String[] args) {

        int[][] arr = {
            {12, 1, 4, 5, 7},
            {2, 4, 57, 8, 6},
            {8, 2, 45, 3, 6}
        };

        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }

    }

}
