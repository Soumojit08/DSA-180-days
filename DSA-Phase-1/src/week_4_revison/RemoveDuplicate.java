package week_4_revison;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,4,5,3,5,6,2};

        reoveDuplicate(arr);
    }

    private static void reoveDuplicate(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);

        int i = 0;
        for (int j = 0; j < n; j++) {
            if (arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
