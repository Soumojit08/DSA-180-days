package Day_11;

import java.util.HashMap;

public class MostFreqElem {
    public static void main(String[] args) {
        int[] arr = {2,1,7,8,2,1,9,10,9,9,2,8,2};
        int ans = mostFrequentElement(arr);
        System.out.println("ans : " + ans);
    }

    static int mostFrequentElement(int[] arr){
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        int ans = -1;
        int maxFreq = 0;

        for (int i = 0; i < arr.length; i++) { // arr[i] = key and Freq = value
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0));

            if (freqMap.get(arr[i])>maxFreq){
                maxFreq = freqMap.get(arr[i]);
                ans = arr[i];
            }
        }

        return ans;
    }
}
