import java.util.*;

public class Sorting {

    void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    void selectionSort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[minIdx]){
                    minIdx = j;
                }
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }
    }

    void insertionSort(int[] arr){
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int curr = i;
            int prev = i - 1;
            int currVal = arr[i];

            while (prev>=0 && currVal < arr[prev]){
                //shifing prev and make place
                arr[prev+1] = arr[prev];
                prev--;
            }
            //place current value in empty space
            arr[prev+1] = currVal;
        }
    }


    void sorts(){
        int[] arr = {6,1,5,3};
        bubbleSort(arr);
        System.out.println("Bubble Sort : " + Arrays.toString(arr));
        int[] arr2 = {4,2,1,5,6};
        selectionSort(arr2);
        System.out.println("Selection Sort : " + Arrays.toString(arr2));
        int[] arr3 = {6,5,1,3,4,2};
        insertionSort(arr3);
        System.out.println("Insertion Sort : " + Arrays.toString(arr3));
    }
}

class Sol {
    public static void main(String[] args) {
        Sorting obj = new Sorting();
        obj.sorts();
    }
}


