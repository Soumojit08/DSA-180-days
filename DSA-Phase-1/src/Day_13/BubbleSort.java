package Day_13;

import Day_12.InsertionSort;
import Day_12.SelectionSort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,4,1,5,7,3};
        InsertionSort.printArray(arr, "Original Array");
        bubbleSort(arr);
        InsertionSort.printArray(arr, "Sorted Array");
    }
    
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    SelectionSort.swap(arr,i,j);
                }
            }
        }
    }
}
