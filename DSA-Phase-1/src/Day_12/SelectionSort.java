package Day_12;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,8,9};
        InsertionSort.printArray(arr, "original array");
        selectionSort(arr);
        InsertionSort.printArray(arr, "sorted array");
    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int minElem = arr[i];
            int minIndx = i;
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j] < minElem){
                        minElem = arr[j];
                        minIndx = j;
                    }
                }
            swap(arr,i,minIndx);
        }
    }

    public static void swap(int[] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
