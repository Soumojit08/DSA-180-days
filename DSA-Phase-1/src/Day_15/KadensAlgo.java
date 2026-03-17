package Day_15;

public class KadensAlgo {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = maximumSumSubArr(arr);
        System.out.println("Maximum sum subarray : " + ans);
    }
    private static int maximumSumSubArr(int[] arr){
        int sum = 0;
        int maxi = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
            maxi = Math.max(maxi,sum);

            if (sum<0){
                sum=0;
            }
        }

        return maxi;
    }
}
