import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] arr = {2,4,6,2,6,1,8};
        System.out.println("Original Array : " + Arrays.toString(arr));

        largestElem(arr);
    }

    public static void largestElem(int[] arr){

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest){
                largest = arr[i];
            }
        }

        System.out.println("Largest Elem : " + largest);
    }
}
