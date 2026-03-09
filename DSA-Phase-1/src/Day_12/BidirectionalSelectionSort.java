package Day_12;

public class BidirectionalSelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,5,4,2,1};
        InsertionSort.printArray(arr, "original array");
        bidirectionalSelectionSort(arr);
        InsertionSort.printArray(arr, "sorted array");
    }

    public static void bidirectionalSelectionSort(int[] arr){
        int n = arr.length;
        int k = n-1;
        for (int i = 0; i < k; i++) {
            int min = arr[i], max = arr[i];
            int minIndx = i, maxIndx=i;
            for (int j = i+1; j <= k; j++) {
                if (arr[j]<min){
                    min=arr[j];
                    minIndx=j;
                } else if (arr[j]>max){
                    max=arr[j];
                    maxIndx=j;
                }
            }
            SelectionSort.swap(arr,i,minIndx);
            if (max==arr[minIndx]){
                SelectionSort.swap(arr,k,minIndx);
            } else {
                SelectionSort.swap(arr,k,maxIndx);
            }
            k--;
        }
    }
}
