import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {2,1,4,4,5,7};

        ArrayList<Integer> ans = removeDuplicate(arr);

        System.out.println(ans);
    }

    static ArrayList<Integer> removeDuplicate(int[] arr){
        int n = arr.length;
        Set<Integer> set = new LinkedHashSet<>();

        for (int x : arr){
            if (set.contains(x)){
                continue;
            }
            set.add(x);
        }

        ArrayList<Integer> list = new ArrayList<>(set);

        return list;

    }
}
