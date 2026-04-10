package Overall_Revision.KadensAlgo;

class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int maxSum = kadanesAlgo(arr);
        System.out.println("Maximum Sum of the linear array : " + maxSum);
        int totalSum = 0;
        for(int i=0; i<arr.length;i++){
            totalSum += arr[i];
            arr[i] = -arr[i];
        }
        System.out.println("Total Sum : " + totalSum);
        int minSum = kadanesAlgo(arr);
        System.out.println("Min Sum : " + (-minSum));
        //circular = total - min then return max(total,circular)
        int circularSum = totalSum - (-minSum);
        System.out.println("Circular Sum : " + circularSum);

        return Math.max(totalSum,circularSum);
    }

    private int kadanesAlgo(int[] arr){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            currentSum += arr[i];
            maxSum = Math.max(currentSum,maxSum);

            if(currentSum < 0){
                currentSum=0;
            }
        }

        return maxSum;
    }

}

public class MaxCircularSubArr {
    public static void main(String[] args) {
        Solution sl = new Solution();
        int[] arr = {1,-2,3,-2};
        int ans = sl.maxSubarraySumCircular(arr);
        System.out.println("Output : " + ans + "Expected Output : 3 ");
    }
}
