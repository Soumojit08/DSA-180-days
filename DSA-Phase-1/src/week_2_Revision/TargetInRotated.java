package week_2_Revision;

public class TargetInRotated {
    public static void main(String[] args) {
        int[] arr = {11,12,13,14,2,3,5,8};
//        int[] arr1 = {1,2,3,4,5,6,7,8};
        int minIndex = minElemIndex(arr);
        System.out.println("no of times array rotated : " + minIndex);
        int target = 5;
        int ans1 = binarySearch(arr, 0, minIndex-1, target);
        int ans2 = binarySearch(arr, minIndex, arr.length-1, target);

        if (ans1!=-1) {
            System.out.println("Elem found at index : " + ans1);
        } else if (ans2!=-1){
            System.out.println("Elem found at index : " + ans2);
        } else {
            System.out.println("Elem not found");
        }

    }

    public static int minElemIndex(int[] arr){
        int start=0;
        int n = arr.length;
        int end=n-1;

        while (start<=end){
            if (arr[start] <= arr[end]) {
                return start;
            }

            int mid = start + (end-start)/2;
            int prev = (mid+n-1)%n;
            int next = (mid+1)%n;

            // 1. Check if mid is the minimum (the Pivot)
            // If mid is smaller than both its neighbors, it is the minimum.
            if (arr[mid] <= arr[prev] && arr[mid] <= arr[next]) {
                return mid; // Return INDEX, not value
            }

            //decide which way to move
            //left half sorted move to right-half
            if (arr[start]<=arr[mid]){
                start=mid+1;
            }
            //right half sorted move to left-half
            else if (arr[mid]<=arr[end]) {
                end=mid-1;
            }

        }
        return 0;
    }

    public static int binarySearch(int[] arr, int start, int end, int target){
        while (start<=end){
            int mid = start + (end-start)/2;

            if (arr[mid] == target){
                return mid;
            } else if (arr[mid]<target){
                start=mid+1;
            } else {
                end=mid-1;
            }
        }
        return -1;
    }
}
