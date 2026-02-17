package Day_7;

public class FindPeakOfBitonic {
    public static void main(String[] args) {
        int[] arr = {2,5,10,15,9,4,1};
        int index = findPeak(arr);
        System.out.println("Elem is : " + arr[index]);
    }

    static int findPeak(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start<=end){
            int mid = start + (end - start)/2;

            int prev = mid-1;
            int next = mid+1;

            if (mid!=0 && mid!=n-1 && arr[mid]>arr[prev] && arr[mid]>arr[next]){
                return mid;
            } else if (mid!=n-1 && arr[mid]<arr[next]){ //first or increasing half so go ahead
                start=mid+1;
            } else { //dec
                end=mid-1;
            }
        }
        return -1;
    }
}
