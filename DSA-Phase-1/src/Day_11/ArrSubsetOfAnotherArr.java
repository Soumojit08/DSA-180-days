package Day_11;

import java.util.HashMap;

public class ArrSubsetOfAnotherArr {
    public static void main(String[] args) {
        long[] a1 = {1, 2, 3, 4, 4, 5, 6};
        long[] a2 = {1,2,4,1,1};
        boolean ans = isSubSet(a1,a2);
        System.out.println("A2 is Subset of A1 : " + ans);
    }

    public static boolean isSubSet(long[] a1, long[] a2){
        HashMap<Long, Integer> freqMap = new HashMap<>();

        //create map
        for(long element:a1){
            freqMap.put(element, freqMap.getOrDefault(element, 0)+1);
        }

        for(long element:a2){
            if (freqMap.containsKey(element) && freqMap.get(element)>0) {
                freqMap.put(element, freqMap.get(element)- 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
