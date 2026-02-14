package Day_5;

import java.util.Arrays;
import java.util.Scanner;

public class MinAbsoluteDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,2,4,5,7,9,25,56,88,94};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter target element : ");
        int target = sc.nextInt();

        int ans = findMinDif(arr,target);
        System.out.println("Absolute Min : " + ans);
    }

    public static int findMinDif(int[] arr, int target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if (arr[mid]==target){
                ans = mid;
                break;
            } else if (arr[mid]<target){
                start=mid+1;
            } else {
                end=mid-1;
            }
        }
        //elem does not exist and Start & End crossed End points floor and Start Celling
        int res = 0;
        if (ans == -1){
            if (end == -1){
                res = Math.abs(target - arr[start]);
            } else if (start == arr.length) {
                res = Math.abs(target - arr[end]);
            } else {
                int ans1 = Math.abs(target - arr[start]);
                int ans2 = Math.abs(target - arr[end]);
                res = Math.min(ans1, ans2);
            }
        }
        return res;
    }
}
