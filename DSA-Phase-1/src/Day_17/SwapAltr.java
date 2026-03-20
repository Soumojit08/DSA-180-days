package Day_17;

import java.util.Arrays;

public class SwapAltr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Og Arr : " + Arrays.toString(arr));
        swapPair(arr);
        System.out.println("Swap Arr : " + Arrays.toString(arr));

    }

    private static void swapPair(int[] arr){
        for (int i = 0; i < arr.length - 1; i=i+2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
}

