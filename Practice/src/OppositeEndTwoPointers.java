import java.util.*;

public class OppositeEndTwoPointers {

    public static void main(String[] args) {

        char[] reverseInput = {'h', 'e', 'l', 'l', 'o'};

        String palindromeInput = "A man, a plan, a canal: Panama";

        int[] twoSumInput = {2, 7, 11, 15};
        int twoSumTarget = 9;

        int[] containerInput = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int[] threeSumInput = {-1, 0, 1, 2, -1, -4};


        // Q1
        reverseString(reverseInput);
        System.out.println(Arrays.toString(reverseInput));


        // Q2
        System.out.println(validPalindrome(palindromeInput));


        // Q3
        System.out.println(Arrays.toString(
                twoSum(twoSumInput, twoSumTarget)
        ));


        // Q4
        System.out.println(
                maxArea(containerInput)
        );


        // Q5
        System.out.println(
                threeSum(threeSumInput)
        );
    }


    /*
     * Q1 — Reverse String
     * LeetCode 344
     *
     * Given a character array, reverse the array IN-PLACE.
     *
     * You must:
     * - Use O(1) extra memory.
     * - Use the opposite-end two pointer technique.
     *
     * Example:
     * Input:  ['h','e','l','l','o']
     * Output: ['o','l','l','e','h']
     *
     * Expected Complexity:
     * Time:  O(n)
     * Space: O(1)
     */
    static void reverseString(char[] s) {

        // WRITE YOUR LOGIC
        int i = 0;
        int j = s.length - 1;

        while (i < j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }

    }


    /*
     * Q2 — Valid Palindrome
     * LeetCode 125
     *
     * Given a String s, determine whether it is a palindrome.
     *
     * Consider ONLY alphanumeric characters and ignore case.
     *
     * Example:
     *
     * Input:
     * "A man, a plan, a canal: Panama"
     *
     * Output:
     * true
     *
     * Explanation:
     * After removing spaces/symbols and ignoring case:
     *
     * "amanaplanacanalpanama"
     *
     * reads the same from both directions.
     *
     * Try solving using opposite-end pointers instead of
     * creating a completely reversed String.
     *
     * Expected Complexity:
     * Time:  O(n)
     * Space: O(1) ideally
     */
    static boolean validPalindrome(String s) {

        // WRITE YOUR LOGIC
        s = s.toLowerCase();
        s = s.replaceAll("^[a-zA-Z0-9]+$", "");
        
        int j = s.length()-1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            j--;
        }

        return true;
    }


    /*
     * Q3 — Two Sum II
     * LeetCode 167
     *
     * You are given a SORTED integer array and a target.
     *
     * Find two numbers whose sum equals target.
     *
     * Return their positions using 1-BASED indexing.
     *
     * Exactly one valid answer exists.
     *
     * Example:
     *
     * numbers = [2,7,11,15]
     * target = 9
     *
     * Output:
     * [1,2]
     *
     * Because:
     * 2 + 7 = 9
     *
     * Constraint:
     * Do NOT solve using nested loops.
     *
     * Expected Complexity:
     * Time:  O(n)
     * Space: O(1)
     */
    static int[] twoSum(int[] numbers, int target) {

        // WRITE YOUR LOGIC
        int l = 0;
        int r = numbers.length-1;

        while (l < r){
            int sum = numbers[l] + numbers[r];

            if (sum == target) {
                return new int[] {l+1, r+1};
            }
            else if (sum < target) {
                l++;
            } else {
                r--;
            }

        }

        return new int[]{};
    }


    /*
     * Q4 — Container With Most Water
     * LeetCode 11
     *
     * Each array element represents the height of a vertical line.
     *
     * Choose TWO lines that can hold the maximum amount of water.
     *
     * Width = distance between the two indices.
     *
     * Height of water =
     * minimum of the two selected heights.
     *
     * Therefore:
     *
     * area = width * min(leftHeight, rightHeight)
     *
     * Example:
     *
     * Input:
     * [1,8,6,2,5,4,8,3,7]
     *
     * Output:
     * 49
     *
     * Requirement:
     * Try to achieve O(n), not O(n²).
     *
     * Expected Complexity:
     * Time:  O(n)
     * Space: O(1)
     */
    static int maxArea(int[] height) {

        // WRITE YOUR LOGIC
        int l = 0;
        int r = height.length - 1;
        int ans = Integer.MIN_VALUE;

        while (l < r){
            int dist = r - l;
            int min = Math.min(height[l],height[r]);
            int maxArea =  min * dist;
            ans = Math.max(maxArea,ans);

            if (min == height[l]){
                l++;
            } else {
                r--;
            }

        }

        return ans;
    }


    /*
     * Q5 — 3Sum
     * LeetCode 15
     *
     * Given an integer array nums, find all UNIQUE triplets:
     *
     * [nums[i], nums[j], nums[k]]
     *
     * such that:
     *
     * nums[i] + nums[j] + nums[k] == 0
     *
     * Example:
     *
     * Input:
     * [-1,0,1,2,-1,-4]
     *
     * Output:
     * [
     *   [-1,-1,2],
     *   [-1,0,1]
     * ]
     *
     * Duplicate triplets are NOT allowed.
     *
     * Hint about the overall structure:
     * Sorting the array may help you turn part of the problem
     * into an opposite-end two-pointer problem.
     *
     * Target Complexity:
     * Time:  O(n²)
     */
    static List<List<Integer>> threeSum(int[] nums) {

        // WRITE YOUR LOGIC
        

        return new ArrayList<>();
    }
}