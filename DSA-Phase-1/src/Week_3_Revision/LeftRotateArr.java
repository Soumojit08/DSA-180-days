package Week_3_Revision;

import java.util.Arrays;

public class LeftRotateArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //output - 2,3,4,5,1 just move the first elem to end
        byOnePlace(arr);
    }

    public static void byOnePlace(int[] arr) { //O(N)
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length-1]=temp;

        System.out.println(Arrays.toString(arr));
    }
}
