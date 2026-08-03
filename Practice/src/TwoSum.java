import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;

        int[] res = twoSum(arr, target);

        System.out.println(Arrays.toString(res));
    }

    public static int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int ans = target - arr[i];
            if (map.containsKey(ans)){
                return new int[] {map.get(ans), i};
            }
            map.put(arr[i],i);
        }
        return new int[]{};
    }
}
