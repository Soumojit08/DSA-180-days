package Week_1_Revision;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,2,5,6,7,11,34,60};
        int target = 34;
        int index = binarySearch(arr, target);
        if (index == -1){
            System.out.println("Elem not found");
        }
        System.out.println("Elem found at index : " + index);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if (arr[mid]==target){
                return mid;
            } else if (arr[mid] < target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
}
