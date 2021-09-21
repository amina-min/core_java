package class_test;

public class BubbleSortMain {

    public static void main(String[] args) {

        int[] arr = {56, 45, 4, 1, 78, 50, 80, 20};
        System.out.println("Before bubble sort ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        BubbleSort bs = new BubbleSort(arr);
        arr = bs.getSortedArray();

        System.out.println("Array After Bubble Sort");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
