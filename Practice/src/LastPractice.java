import java.util.*;

public class LastPractice {
    public static void main (String[] args){
        stringPractice();
        mathPractice();
        advancePractice();
    }

    public static void stringPractice(){
        class StringQuestions{
            void reverse() {
                String s = "abcde";
                char[] str = s.toCharArray();
                int i = 0;
                int j = str.length - 1;

                while (i < j){
                    char temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                    i++;
                    j--;
                }
                System.out.println(Arrays.toString(str));
                String st = new String(str);
                System.out.println(st);
            }

            void palindrome() {
                String t = "mammam";
                char[] str = t.toCharArray();
                int i = 0;
                int j = str.length - 1;
                boolean ans = true;

                while (i < j){
                    if (str[i] != str[j]){
                        ans = false;
                        break;
                    }
                    i++;
                    j--;
                }
                System.out.println("Palindrome : " + ans);

            }

            boolean anagram(){
                String a = "tac";
                String b = "tacc";
                int al = a.length();
                int bl = b.length();
                Map<Character,Integer> map = new HashMap<>();

                if (al != bl) return false;

                for (int i=0; i<al;i++){
                    Character s = a.charAt(i);
                    Character t = b.charAt(i);

                    map.put(s,map.getOrDefault(s,0)+1);
                    map.put(t,map.getOrDefault(t,0)-1);
                }

                for (int x : map.values()){
                    if (x != 0) return false;
                }
                return true;
            }

            void minCharFreq() {
                String s = "aabbcddnkfdsgbjkdsjkbdfjbkdffjkdscccvdkjvbsdkj";
                Map<Character, Integer> map = new HashMap<>();
                int sl = s.length();

                for (int i=0; i< sl; i++){
                    Character t = s.charAt(i);

                    map.put(t, map.getOrDefault(t,0)+1);
                }
                int min = Integer.MAX_VALUE;
                char ans = '\0';
                for(char x : map.keySet()){
                    int y = map.get(x);

                    if (y < min) {
                        min = y;
                        ans = x;
                    }
                }
                System.out.println("Min Count : " + min + " of Char : " + ans);
            }

            void removeDuplicate() {
                String s ="programming";
                int sl = s.length();
                Set<Character> set = new LinkedHashSet<>(); // Linked Hash set to follow insertion order

                for (char x : s.toCharArray()){
                    set.add(x); // auto reject duplicate values

                }
                for (char x : set){
                    System.out.print(x);
                }
            }

            void longestWord() {
                String sentence = "I love programming";
                String[] words = sentence.split(" ");
                String longest = "";

                for (int i=0; i<words.length; i++){
                    if (words[i].length() > longest.length()){
                        longest = words[i];
                    }
                }

                System.out.println("\nLongest Word : " + longest);
            }

            void countVowelConsonent() {
                String s = "soumoJiT08@gmail.com";
                s = s.toLowerCase();
                s = s.replaceAll("[^a-zA-Z]", "");
                int vowelCount = 0, consonentCount = 0;

                for (int i = 0; i < s.length(); i++) {
                    char x = s.charAt(i);
                    if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
                        vowelCount++;
                    } else {
                        consonentCount++;
                    }
                }
                System.out.println(s);
                System.out.println("Vowel : " + vowelCount + " Consonant : " + consonentCount);

            }
        }

        StringQuestions obj = new StringQuestions();
        obj.reverse();
        obj.palindrome();
        System.out.println("anagram : " + obj.anagram());
        obj.minCharFreq();
        obj.removeDuplicate();
        obj.longestWord();
        obj.countVowelConsonent();
    }

    public static void mathPractice(){
        int num = 5;

        if (num < 2) System.out.println("not prime");

        for (int i=2; i<=num; i++){
            if (num % i == 0 ) System.out.println("Not prime");
        }

        System.out.println("prime");
    }

    public static void advancePractice() {
        
    }
}