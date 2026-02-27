package Day_9;

public class MaxSumSubarrK {
    public static void main(String[] args) {
        int[] arr = {2,5,1,8,2,9,1};
        int n = arr.length;
        int k = 3;

        int ans = findMaxSubarr(arr, n, k);
        System.out.println("Min Subarray Max sum : " + ans);
    }

    public static int findMaxSubarr(int[] arr, int n, int k){
        int start = 0;
        int end = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        while (end<n){
            sum = sum + arr[end];

            if (end-start+1 < k){
                end++;
            } else if (end-start+1 == k) {
                max = Math.max(max,sum);
                sum = sum - arr[start];
                start++;
                end++;
            }
        }

        return max;
    }
}
