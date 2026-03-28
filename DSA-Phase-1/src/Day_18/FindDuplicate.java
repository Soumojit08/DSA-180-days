package Day_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,4,5,5,6,7,8};
//        int ans = findDuplicateSorted(arr);
//        System.out.println("Duplicate : " + ans);
        List<Integer> ans1 = findDuplicateHashing(arr);

        for (int x : ans1){
            System.out.println("Duplicates " + ans1);
        }
    }

    private static int findDuplicateSorted(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }

    private static List<Integer> findDuplicateHashing(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> duplicate = new ArrayList<>();

        for(Integer num : arr){
            map.put(num , map.getOrDefault(num,0)+1);
        }

        for (Integer x : map.values()){
            if (x>1){
                duplicate.add(x);
            }
        }

        return duplicate;
    }


}
