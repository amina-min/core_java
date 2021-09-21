package class_test;

public class BubbleSort {

    int[] array;

    public BubbleSort(int[] arr) {
        array = arr;

    }

    public int[] getSortedArray() {

        int temp = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 1; j < array.length; j++) {

                if (array[j] < array[j - 1]) {

                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }

            }

        }

        return array;
    }

}
