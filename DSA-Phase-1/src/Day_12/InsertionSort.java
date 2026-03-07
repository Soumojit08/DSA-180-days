package Day_12;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9,5,1,4,6,1};
        printArray(arr,"Original Array");
        insertionSort(arr);
    }

    public static void printArray(int[] arr, String msg){
        System.out.println(msg);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr){
        int n = arr.length;

        for (int i=1;i<n;i++){
            int key=arr[i];
            int j = i-1;

            //shifting
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }

            //insert at j+1
            arr[j+1] = key;
        }

        printArray(arr,"Sorted Array");
    }
}
