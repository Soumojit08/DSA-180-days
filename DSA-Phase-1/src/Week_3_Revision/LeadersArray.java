package Week_3_Revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersArray {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};

        brute(arr);
    }

    private static void brute(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        // Last element of the array is always a leader
        int max = nums[nums.length - 1];
        ans.add(nums[nums.length - 1]);

        // Check elements from right to left
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > max) {
                ans.add(nums[i]);
                max = nums[i];
            }
        }

        /* Reverse the list to match
        the required output order */
        Collections.reverse(ans);

        for (int a : ans){
            System.out.println("leader : " + a);
        }
    }
}
