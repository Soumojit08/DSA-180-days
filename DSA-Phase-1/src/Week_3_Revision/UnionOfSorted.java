package Week_3_Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionOfSorted {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6};

        unionArray(arr1,arr2);
    }

    private static void unionArray(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;

        int i = 0, j = 0;

        List<Integer> Union = new ArrayList<>();

         while (i<n1 && j<n2){
             // If element in arr1 is smaller
             if (arr1[i] < arr2[j]) {
                 // Add if empty or not duplicate
                 if (Union.isEmpty() || Union.getLast() != arr1[i])
                     Union.add(arr1[i]);
                 i++;  // Move pointer in arr1
             } else if(arr2[j]< arr1[i]){
                 // Add if empty or not duplicate
                 if (Union.isEmpty() || Union.getLast() != arr2[j])
                     Union.add(arr2[j]);
                 j++;  // Move pointer in arr2
             } else {
                 // Elements are equal, add once if not duplicate
                 if (Union.isEmpty() || Union.getLast() != arr1[i])
                     Union.add(arr1[i]);
                 i++; j++;  // Move both pointers
             }
         }

         while (i<n1){
             if (Union.isEmpty() || Union.getLast() != arr1[i])
                 Union.add(arr1[i]);
             i++;
         }

        while (j<n2){
            if (Union.isEmpty() || Union.getLast() != arr2[j])
                Union.add(arr2[j]);
            j++;
        }

        //Print Union List
        for (int k : Union){
            System.out.println(k);
        }
    }
}
