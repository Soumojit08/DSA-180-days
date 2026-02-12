package Day_5;

import java.util.Arrays;
import java.util.Scanner;

public class CountOccUsingBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,2,4,4,8,12,16};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter target element : ");
        int target = sc.nextInt();

        int first = firstOccurrence(arr,target);
        int last = lastOccurrence(arr,target);
        countOccurrence(first,last);
    }

    public static int firstOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if (arr[mid]==target){
                ans = mid;
                end=mid-1;
            } else if (arr[mid]<target){
                start=mid+1;
            } else {
                end=mid-1;
            }
        }
        return ans;
    }

    public static int lastOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if (arr[mid]==target){
                ans = mid;
                start=mid+1;
            } else if (arr[mid]<target){
                start=mid+1;
            } else {
                end=mid-1;
            }
        }
        return ans;
    }

    public static void countOccurrence(int first, int last){
        //including elem formula = (upperLimit - lowerLimit + 1)
        int ans = last - first + 1;
        System.out.println("Number of times occurred : " + ans);
    }
}
