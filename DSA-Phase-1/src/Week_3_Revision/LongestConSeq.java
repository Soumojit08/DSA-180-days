package Week_3_Revision;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConSeq {
    public static void main(String[] args) {
        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};

        better(arr);
        optimal(arr);
    }

    private static void better(int[] arr) {
        int longest = 1, currentSeq = 0, last_Smaller = Integer.MIN_VALUE;

        // first sort
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - 1 == last_Smaller) {
                currentSeq += 1;
                last_Smaller = arr[i];
            } else if (arr[i] - 1 != last_Smaller) {
                currentSeq = 1;
                last_Smaller = arr[i];
            }
            longest = Math.max(longest, currentSeq);
        }

        System.out.println("Longest Seq : " + longest);
    }

    private static void optimal(int[] arr){
        int n = arr.length;

        int longest = 1;

        Set<Integer> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            st.add(arr[i]);
        }

        for (int it : st){
            if (!st.contains(it-1)){
                int cnt = 1;
                int x = it;

                while (st.contains(x+1)){
                    x=x+1;
                    cnt=cnt+1;
                }
            longest=Math.max(longest,cnt);
            }
        }
        System.out.println("longest : " + longest);
    }
}
