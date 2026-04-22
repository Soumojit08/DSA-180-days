package Week_3_Revision;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 4, 3, 0, 0};
        int n = arr.length;
//        brute not possible TC - N*N!
        int ans = optimal(arr, n);

        //reverse array ;
        if (ans == -1) {
//            for (int i = 0; i < n / 2; i++) {
//                int temp = arr[i];
//                arr[i] = arr[n - 1 - i];
//                arr[n - 1 - i] = temp;
//            }
            reverse(arr,0,n-1);
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println(Arrays.toString(arr));
        }
    }

    private static int optimal(int[] arr, int n) {
        int idx = -1;

        //find break point index if no dip in array then its sorted reverse it for ans eg : [1,2,3,4,5] ans : [5,4,3,2,1]
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                idx = i;
                break;
            }
        }
        //find slightly greater elem
        for (int i = n - 1; i >= idx; i--) {
            if (arr[i] > arr[idx]) {
                swap(arr,idx,i);
                break;
            }
        }

        reverse(arr,idx+1,n-1);

        return idx;
    }

    private static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    private static void reverse(int[] arr, int start, int end){
        while (start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
