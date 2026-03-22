package Day_18;

import java.util.ArrayList;
import java.util.List;

public class IntersectionArray {
    public static void main(String[] args) {
        int[] arr1 = {1,4,5,6,7};
        int[] arr2 = {3,4,5};

        List<Integer> ans = intersectionArray(arr1,arr2);

        for (int x : ans){
            System.out.print("[ " + x + " ]");
        }
    }

    private static List<Integer> intersectionArray(int[] arr1, int[] arr2){
        List<Integer> common = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            int elem = arr1[i];

            for (int j = 0; j < arr2.length; j++) {
                if (elem == arr2[j]){
                    common.add(elem);
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }

        return common;
    }
}
