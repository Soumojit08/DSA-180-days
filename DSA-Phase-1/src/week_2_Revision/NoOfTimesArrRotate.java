package week_2_Revision;

public class NoOfTimesArrRotate {
    public static void main(String[] args) {
        int[] arr = {11,12,13,14,2,3,5,8};
        int[] arr1 = {1,2,3,4,5,6,7,8};
        int noOfTimesArrRotated = findRotation(arr1);
        System.out.println("no of times array rotated : " + noOfTimesArrRotated);
    }

    public static int findRotation(int[] arr){
        int start=0;
        int n = arr.length;
        int end=n-1;

        while (start<=end){
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

}
