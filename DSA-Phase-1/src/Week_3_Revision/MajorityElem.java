package Week_3_Revision;

import java.util.HashMap;
import java.util.Map;

public class MajorityElem {
    public static void main(String[] args) {
        int[] arr = {3, 1, 1, 3, 1, 1, 2};

        better(arr);
        optimal(arr);
    }

    private static void better(int[] arr) {
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

    private static void optimal(int[] arr) {
        int elem = 0;
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count=1;
                elem = arr[i];
            }
            else if (arr[i] == elem) {
                count++;
            } else {
                count--;
            }
        }

        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == elem) {
                cnt1++;
            }
        }

        if (cnt1 > (n / 2)) {
            System.out.println("Majority elem : " + elem);
        } else {
            System.out.println("Doesn't exist");
        }
    }
}
