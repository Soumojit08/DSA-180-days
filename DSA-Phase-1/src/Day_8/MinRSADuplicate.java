package Day_8;

public class MinRSADuplicate {
    public static void main(String[] args) {
        int[] arr = {4,5,4,6,7,0,1,2};
        int ans = findMin(arr);
        System.out.println("Min : " + ans);
    }

    public static int findMin(int[] arr) {
        int minimum = Integer.MAX_VALUE;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[start] == arr[mid] && arr[mid] == arr[end]){
                start++;
                end--;
                continue;
            }

            if (arr[start] <= arr[mid]) {
                minimum = Math.min(minimum, arr[start]);
                start = mid + 1;
            } else {
                minimum = Math.min(minimum, arr[mid]);
                end = mid - 1;
            }
        }

        return minimum;
    }
}
