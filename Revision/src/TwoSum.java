import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, -2, 1, 0, 5};
        int target = 0;
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] twoSum(int[] arr, int target){
        int n = arr.length;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int elem = target - arr[i];
            if (map.containsKey(elem)){
                return new int[] {elem, arr[i]};
            }
            map.put(arr[i],i);
        }
        return new int[] {};
    }
}
