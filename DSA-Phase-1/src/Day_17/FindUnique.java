package Day_17;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {3,7,2,2,7,3,4};
        int ans = unique(arr);
        System.out.println("Unique elem : " + ans);
    }

    private static int unique(int[] arr){
        int ans = 0;
        for (int i=0; i<arr.length; i++){
            ans = ans^arr[i];
        }

        return ans;
    }
}
