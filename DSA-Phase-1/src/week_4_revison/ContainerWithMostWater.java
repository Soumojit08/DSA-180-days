package week_4_revison;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        maxContainer(arr);
    }

    public static void maxContainer(int [] arr){
        int n = arr.length;

        int i = 0;
        int j = n-1;
        int ans = Integer.MIN_VALUE;

        while (j>i){
            int dist = j - i;
            int min = Math.min(arr[i], arr[j]);

            int capacity = dist * min;
            ans = Math.max(capacity , ans);

            if (min == arr[i]){
                i++;
            } else {
                j--;
            }
        }

        System.out.println("Max Capacity : " + ans);
    }
}




