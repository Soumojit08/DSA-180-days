package Week_3_Revision;

import java.util.Arrays;

public class SortOneTwos {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};

        betterApproach(arr);

        optimalApproach(arr);
    }

    public static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }

    private static void betterApproach(int[] arr) { //TC - O(2N) SC - O(1)
        int count0 = 0, count1 = 0, count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) count0++;
            else if (arr[i] == 1) count1++;
            else count2++;
        }

        for (int i = 0; i < count1; i++) {
            arr[i] = 0;
        }
        for (int i = count0; i < count0 + count1; i++) {
            arr[i] = 1;
        }
        for (int i = count0 + count1; i < arr.length; i++) {
            arr[i] = 2;
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void optimalApproach(int[] arr) {
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, high, mid);
                mid++;
                high--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
