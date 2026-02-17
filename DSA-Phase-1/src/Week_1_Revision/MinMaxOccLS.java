package Week_1_Revision;

import java.util.Arrays;

public class MinMaxOccLS {
    public static void main(String[] args) {
        int[] arr = {1,5,5,6,3,6,9,6,2};
        int[] occ = findMinMaxOcc(arr);
        System.out.println(Arrays.toString(occ) + " Elem appears most times");
        System.out.println("Min Occurred elem is : " + arr[occ[0]]);
        System.out.println("Max Occurred elem is : " + arr[occ[1]]);
    }

    static int[] findMinMaxOcc(int[] arr){
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count++;
                    ans[i] = count;
                }
            }
        }
        
        int max = ans[0];
        int min = ans[0];
        int[] index = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (ans[i]<min){
                min = ans[i];
                index[0] = i;
            }
            if (ans[i]>max){
                max=ans[i];
                index[1]=i;
            }
        }



        return index;
    }
}
