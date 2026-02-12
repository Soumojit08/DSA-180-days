package Day_5;

import java.util.Arrays;
import java.util.Scanner;

public class FloorAndCelling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4,4,8,8,8,15,16,23,42};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter target element : ");
        int target = sc.nextInt();

        int floor = floorOfNumber(arr,target);
        System.out.println("Floor Ans : " + floor);
        int celling = cellingOfNumber(arr,target);
        System.out.println("Floor Ans : " + celling);
    }

    public static int floorOfNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if (arr[mid]==target){
                return arr[mid];
            } else if (arr[mid]<target){
                start=mid+1;
                ans = arr[mid];
            } else {
                end=mid-1;
//                ans = arr[mid]; for celling
            }
        }
        return ans;
    }

    public static int cellingOfNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if (arr[mid]==target){
                return arr[mid];
            } else if (arr[mid]<target){
                start=mid+1;
//                ans = arr[mid]; for floor
            } else {
                end=mid-1;
                ans = arr[mid];
            }
        }
        return ans;
    }
}
