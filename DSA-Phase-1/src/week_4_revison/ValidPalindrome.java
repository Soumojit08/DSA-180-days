package week_4_revison;

import java.util.Arrays;

public class ValidPalindrome {
    public static void main(String[] args) {
        Solution obj = new Solution();

        String res = obj.validPalindromeCheck("A man, a plan, a canal: Panama") ? "Valid " : "Not Valid";
        System.out.println(res);
    }
}

class Solution {
    public boolean validPalindromeCheck(String s){
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]","");
//        char[] arr = s.toCharArray();
        int n = s.length();

        System.out.println(s);

        int j=n-1;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            j--;
        }

        return true;
    }
}
