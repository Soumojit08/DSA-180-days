package week_2_Revision;

public class NearlySortedArr {
    public static void main(String[] args) {
        int[] arr = {5,10,30,20,40};
        int target = 10;
        int index = nearlySorted(arr,target);
        System.out.println("Elem found at index : " + index);
    }

    public static int nearlySorted(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            int mid = start + (end-start)/2;

            if (target==arr[mid]){
                return mid;
            } else if (target==arr[mid+1]) {
                return mid;
            } else if (target==arr[mid-1]) {
                return mid;
            }else if (arr[mid]<target){
                start=mid+2;
            } else {
                end=mid-2;
            }
        }
        return -1;
    }
}
