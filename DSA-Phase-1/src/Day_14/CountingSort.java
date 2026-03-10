package Day_14;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {1,1,0,5,4};
        System.out.println(Arrays.toString(arr));
        int[] res = countingSort(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] countingSort(int[] arr){

        int max = Integer.MIN_VALUE;
        for (int val : arr){
            max = Math.max(max,val);
        }

        int[] count = new int[max+1];

        for (int val : arr){
            count[val]++;
        }

        for (int i = 1; i <= max; i++){
            count[i] += count[i-1];
        }

        int n = arr.length;
        int[] res = new int[n];

        for (int i = n-1; i >= 0 ; i--){
            int val = arr[i];
            int prefixCount = count[val];
            res[prefixCount-1] = val;
            count[val]--;
        }

        return res;
    }
}
