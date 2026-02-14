package Day_6;

public class BitonicArrMin {
    public static void main(String[] args) {
        int[] arr = {1,4,5,11,7,5,0};
        int min = findMin(arr);
        System.out.println("Minimum : " + min);
    }

    public static int findMin(int[] arr){
        return Math.min(arr[0], arr[arr.length-1]);
    }
}
