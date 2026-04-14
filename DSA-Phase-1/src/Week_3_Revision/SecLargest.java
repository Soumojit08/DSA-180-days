package Week_3_Revision;

public class SecLargest {
    public static void main(String[] args) {
        int[] arr = {2,5,4,3,1};

        secondLargest(arr);
    }

    private static void secondLargest(int[] arr){
        int large = Integer.MIN_VALUE;
        int secLarge = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>large){
                secLarge = large;
                large = arr[i];
            } else if (arr[i]>secLarge && arr[i] != large) {
                secLarge = arr[i];
            }
        }

        System.out.println("Second Large : " + secLarge);
    }
}
