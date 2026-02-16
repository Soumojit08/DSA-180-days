package Day_7;

public class FindPeakOfBitonic {
    public static void main(String[] args) {
        int[] arr = {2,5,10,15,9,4,1};
        int index = findPeak(arr);
        System.out.println("Elem is : " + arr[index]);
    }

    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start<=end){
            int mid = start + (end - start)/2;

            if (mid==0 || mid==arr.length-1){
                return -1;
            }

            int prev = mid-1;
            int next = mid+1;

            if (arr[mid]>arr[prev] && arr[mid]>arr[next]){
                return mid;
            } else if (arr[mid]<arr[next]){
                start=mid+1;
            } else {
                end=mid-1;
            }
        }
        return -1;
    }
}
