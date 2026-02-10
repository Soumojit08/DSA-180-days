//FIND ELEMENT IN ARRAY LINEAR SEARCH
package Day_1;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element : ");
        int target = sc.nextInt();
        boolean firstOccurrence = false;
        System.out.println("Want First Occurrence ?(By default Last):(Y/N)");
        String ans = sc.next().toUpperCase();
        if (ans.equals("Y")){
            firstOccurrence = true;
        }
        linearSearch(arr, target, firstOccurrence);
        findOccurrence(arr, target);
        findMinMax(arr);
        checkSorted(arr);
    }

    public static void linearSearch(int[] arr, int target, boolean firstOccurrence){
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                ans = i;
                if (firstOccurrence){
                    break;
                }
            }
        }
        if (ans == -1){
            System.out.println("Element not found");
        }
        System.out.println("Elem " + target + " found at index " + ans);
    }

    public static void findOccurrence(int[] arr, int target){
        int occurrence = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                occurrence++;
            }
        }
        if (occurrence == 0 ){
            System.out.println("Elem not present in array ");
        }
        System.out.println("Element occurred " + occurrence + " times");
    }

    public static void findMinMax(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Min elem : " + min);
        System.out.println("Max elem : " + max);
    }

    public static void checkSorted(int[] arr){
        boolean sorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i]){
                sorted = false;
            }
        }

        if (!sorted) {
            System.out.println("Array is not sorted");
        }
        System.out.println("Array is sorted");
    }
}
