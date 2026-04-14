package Week_3_Revision;

public class FindMissing {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 9, 10};

        findMissing(arr);
    }

    public static void findMissing(int[] arr) {
        int sum = 0;
        int n = arr.length + 1;
        int expSum = n * (n + 1) / 2;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int missing = expSum - sum;
        System.out.println("Missing No : " + missing);
    }
}
