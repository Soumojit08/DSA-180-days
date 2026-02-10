package Day_2;

import java.util.Scanner;

public class ArrayFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target : ");
        int target = sc.nextInt();
        countOccurrence(arr, target);
    }

    public static void countOccurrence(int[] arr, int target){
        int occurrence = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] == target){
                occurrence++;
            }
        }
        System.out.println("Elem occurred : " + occurrence);
    }

}
