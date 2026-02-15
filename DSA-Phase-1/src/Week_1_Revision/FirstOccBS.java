package Week_1_Revision;

import java.util.Scanner;

public class FirstOccBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element : ");
        int target = sc.nextInt();
        int first = firstOccurrence(arr, target);
        System.out.println("First occ " + first);
        int last = lastOccurrence(arr, target);
        System.out.println("Last occ " + last);
    }

    static int firstOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while (start<=end){
            int mid = start + (end-start)/2;

            if (arr[mid]==target){
                ans = mid;
                end = mid-1;
            } else if (arr[mid]<target) {
                start=mid+1;
            } else {
                end=mid-1;
            }
        }

        return ans;
    }

    static int lastOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while (start<=end){
            int mid = start + (end-start)/2;

            if (arr[mid]==target){
                ans = mid;
                start = mid+1;
            } else if (arr[mid]<target) {
                start=mid+1;
            } else {
                end=mid-1;
            }
        }

        return ans;
    }
}
