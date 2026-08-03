public class MaxSubArrSum {
    public static void main(String[] args) {
        int[] arr = {4,1,-2,5,-1,5,7};
        int current = 0;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (current<0){
                current = 0;
            }
            current = current + arr[i];

            if (current > ans){
                ans = current;
            }
        }

        System.out.println("Sum of Sub Array :" + ans);

    }
}
