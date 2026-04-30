package Day_19;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        Solution obj = new Solution();

        String res = obj.isAnagram("car","rat") ? "Is Anagram" : "Not a Anagram";
        System.out.println(res);
    }
}

class Solution {
    public boolean isAnagram(String s, String t){
        int n1 = s.length();
        int n2 = t.length();

        if (n1!=n2) return false;

        Map<Character, Integer> freqMap = new HashMap<>();
        Map<Character, Integer> freqMap2 = new HashMap<>();



        for (int i=0;i<n1; i++){
            freqMap.put(s.charAt(i), freqMap.getOrDefault(s.charAt(i), 0)+1);
        }

        System.out.println(freqMap);

        for (int i=0;i<n2; i++){
            freqMap2.put(t.charAt(i), freqMap2.getOrDefault(t.charAt(i), 0)+1);
        }

        System.out.println(freqMap2);

        return freqMap.equals(freqMap2);
    }
}
