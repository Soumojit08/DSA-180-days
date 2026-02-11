package Day_2;

import java.util.Arrays;
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
        freqOfAllElem(arr);
        findMaxFreq(arr);
        findMinFreq(arr);
    }

    public static void countOccurrence(int[] arr, int target){
        int occurrence = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] == target){
                occurrence++;
            }
        }
        System.out.println("Elem " + target + " occurred : " + occurrence);
    }

    public static void freqOfAllElem(int[] arr){
        int[] occurrence = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count++;
                    occurrence[i] = count;
                }
            }
        }

        System.out.println("Occurrence of elem : " + Arrays.toString(occurrence));
    }

    public static void findMaxFreq(int[] arr){
        int[] occurrence = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count++;
                    occurrence[i] = count;
                }
            }
        }

        int max = occurrence[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (occurrence[i] > max){
                max = occurrence[i];
                index = i;
            }
        }

        System.out.println("Max freq elem " + arr[index] + " appeared times : " + max);
    }

    public static void findMinFreq(int[] arr){
        int[] occurrence = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count++;
                    occurrence[i] = count;
                }
            }
        }

        int min = occurrence[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (occurrence[i] < min){
                min = occurrence[i];
                index = i;
            }
        }

        System.out.println("Min freq elem " + arr[index] + " appeared times : " + min);
    }

}
