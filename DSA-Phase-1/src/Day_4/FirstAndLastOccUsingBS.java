package Day_4;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastOccUsingBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,2,4,4,8,12,16};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter target element : ");
        int target = sc.nextInt();

        int ans = firstOccurrence(arr, target);
        if (ans == -1) System.out.println("Elem not present in array");
        System.out.println("Elem first occurrence " + target + " found at index at " + ans);

        int ansLast = lastOccurrence(arr, target);
        if (ansLast == -1) System.out.println("Elem not present in array");
        System.out.println("Elem last occurrence " + target + " found at index at " + ansLast);
    }

    public static int firstOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while (start<=end){
            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                ans = mid; //store possible ans
                end = mid-1; // trim array to search left half space only
            } else if (arr[mid] < target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        return ans;
    }

    public static int lastOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while (start<=end){
            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                ans = mid; // store possible ans
                start = mid+1; //trim array for right half space only
            } else if (arr[mid] < target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        return ans;
    }
}
