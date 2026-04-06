package Overall_Revision.KadensAlgo;

public class MaxSubArrSum {
    public static void main(String[] args) {
        int[] arr = {3,-4,5,4,-1,7,-8};
//        bruteForce(arr);
        optimalApproach(arr);
    }

    private static void bruteForce(int[] arr){
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                maxSum = Math.max(currentSum, maxSum);
            }
        }

        System.out.println("Maximum : " + maxSum);
    }

    private static void optimalApproach(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            maxSum = Math.max(currentSum,maxSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println("Maximum : " + maxSum);
    }
}
