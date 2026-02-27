package Day_10;

import java.util.ArrayList;
import java.util.List;

public class SubArrFirstNeg {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -16, 30, 28};
        int[] neg = findFirstNeg(arr, arr.length, 3);

        for(int n:neg){
            System.out.println(n);
        }
    }

    public static int[] findFirstNeg(int[] arr, int size, int k){
        int[] res = new int[size-k+1];
        List<Integer> list = new ArrayList<>();

        int i = 0; //start
        int j = 0; //end

        while (j<size){

            if (arr[j]<0){
                list.add(j);
            }

            if (j-i+1 < k){
                j++;
            } else if (j-1+1 == k) {
                if (!list.isEmpty() && list.get(0) >= i) {
                    res[i] = arr[list.get(0)];
                } else {
                    res[i] = 0;
                }

                if (!list.isEmpty() && list.get(0) == i){
                    list.remove(0);
                }
                i++;
                j++;
            }
        }

        return res;
    }
}
