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
        //Sort
        Arrays.sort(arr);
        //Creating List of List
        List<List<Integer>> uniqueTriplate = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n-2 ; i++) {
            if (i > 0 && arr[i] == arr[i-1]) {
                continue;
            }

            int j = i+1;
            int k = n-1;

            while (j<k){
                int target = arr[i] + arr[j] + arr[k];

                if (target == 0){
                    uniqueTriplate.add(new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k])));
                    while (j<k && arr[j] == arr[j+1]) j++;
                    while (j<k && arr[k] == arr[k-1]) k--;
                    j++;
                    k--;
                } else if (target < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        System.out.println(uniqueTriplate);

    }
}
