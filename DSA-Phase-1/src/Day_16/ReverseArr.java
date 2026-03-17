package Day_16;

import Day_12.InsertionSort;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {2,5,4,3,1};
        InsertionSort.printArray(arr,"Original Array");
        reverseArray(arr);
        InsertionSort.printArray(arr,"Reverse Array");
    }

    public static void reverseArray(int[] arr){
        int n = arr.length;
        int i=0;
        int j=n-1;

        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}
