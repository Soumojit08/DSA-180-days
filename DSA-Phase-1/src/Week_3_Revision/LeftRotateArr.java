package Week_3_Revision;

import java.util.Arrays;

public class LeftRotateArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        //output - 2,3,4,5,1 just move the first elem to end
//        byOnePlace(arr);
        int k = 3;
        byKPlace(arr, k);
    }

    public static void byOnePlace(int[] arr) { //O(N)
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;

        System.out.println(Arrays.toString(arr));
    }

    public static void byKPlace(int[] arr, int k) {
        //Reverse the array 3 times to get ans
        int n = arr.length;
        k = k % n;

        //reverse entire array
        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, n - 1);

        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while (end > start) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
