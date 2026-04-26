package week_4_revison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};

        optimal(arr);
    }

    private static void optimal(int[] arr) {
        //sort the array
        Arrays.sort(arr);
        int n = arr.length;
        List<List<Integer>> uniqueTriplets = new ArrayList<>();
        // for i value have 2 pointer j and k to check the condition arr[i]+arr[j]+arr[k] = 0

        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            while (j < k) {
                int target = arr[i] + arr[j] + arr[k];
                if (target == 0) {
                    uniqueTriplets.add(new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k])));
                    while (arr[j] == arr[j + 1]) j++;
                    while (arr[k] == arr[k - 1]) k--;
                    j++;
                    k--;
                } else if (target < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }


        System.out.println(uniqueTriplets);
    }
}
