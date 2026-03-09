package Day_13;

import Day_12.InsertionSort;
import Day_12.SelectionSort;

public class BrickSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5, 7, 3};
        InsertionSort.printArray(arr, "Original Array");
        brickSort(arr);
        InsertionSort.printArray(arr, "Sorted Array");
    }

    public static void brickSort(int[] arr) {
        boolean isSorted = false;
        while (!isSorted) {
            //even phase
            boolean flag = false;
            for (int i = 0; i < arr.length - 1; i = i + 2) {
                if (arr[i] > arr[i + 1]) {
                    SelectionSort.swap(arr, i, i + 1);
                    flag = true;
                }
            }

            //odd phase
            for (int i = 1; i < arr.length - 1; i = i + 2) {
                if (arr[i] > arr[i + 1]) {
                    SelectionSort.swap(arr, i, i + 1);
                    flag=true;
                }
            }

            if (!flag){
                isSorted = true;
            }

        }
    }
}
