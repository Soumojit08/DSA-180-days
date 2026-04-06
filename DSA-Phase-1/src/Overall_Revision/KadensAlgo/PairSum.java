package Overall_Revision.KadensAlgo;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {2,3,11,5};
        int target = 5;

//        bruteForce(arr, target);
        optimal(arr,target);
    }

    private static void bruteForce(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int pair = arr[i] + arr[j];
                if (target == pair){
                    System.out.println("The pair is : " + arr[i] + " , " + arr[j]);
                    break;
                }
            }
        }
    }

    private static void optimal(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            int sum = arr[start]+arr[end];

            if (sum<target) {
                start++;
            } else if(sum>target) {
                end--;
            } else {
                System.out.println("The pair is : " + arr[start] + " , " + arr[end]);
                break;
            }
        }
    }
}
