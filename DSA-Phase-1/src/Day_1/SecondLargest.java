package Day_1;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        secondLargestElement(arr);
    }

    public static void secondLargestElement(int[] arr){
        int largest = arr[0];
        int secLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest){
                secLargest = largest;
                largest = arr[i];
            }
            if (arr[i]<largest && arr[i]>secLargest){
                secLargest = arr[i];
            }
        }
        System.out.println("Largest elem : " + largest);
        System.out.println("Second Largest elem : " + secLargest);
    }
}
