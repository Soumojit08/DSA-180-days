package Week_3_Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};

        brute(arr);
        optimal(arr);
    }

    private static void brute(int[] arr) {
        int n = arr.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]);
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                neg.add(arr[i]);
            }
        }

        for (int i = 0; i < n / 2; i++) {
            arr[2 * i] = pos.get(i);
            arr[2 * i + 1] = neg.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void optimal(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];

        int posIndex = 0, negIndex = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i]>0){
                ans[posIndex] = arr[i];
                posIndex += 2;
            } else {
                ans[negIndex] = arr[i];
                negIndex += 2;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
