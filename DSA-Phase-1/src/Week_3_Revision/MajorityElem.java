package Week_3_Revision;

import java.util.HashMap;
import java.util.Map;

public class MajorityElem {
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 3, 1, 2, 2};
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        boolean found = false;

        for (Integer key : map.keySet()) {
            int count = map.get(key);
            if (count > n / 2) {
                System.out.println("Majority Element : " + key);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Doesn't exist");
        }
    }
}
