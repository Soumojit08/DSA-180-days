package Day_1;

import java.util.Scanner;

public class LargestElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        largestElement(arr);
    }

    public static void largestElement(int[] arr){
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]){
                largest = arr[i];
            }
        }
        System.out.println("Largest elem : " + largest);
    }
}
