import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] arr = {2,4,6,2,6,1,8,15};
        System.out.println("Original Array : " + Arrays.toString(arr));

        largestElem(arr);
        smallestElem(arr);
        sumElem(arr);
        countEvenOdd(arr);
        avg(arr);
        linearSearch(arr, 15);
        reverseArray1(arr);
        reverseArray2(arr);
        checkSorted(arr);
    }

    public static void largestElem(int[] arr){

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest){
                largest = arr[i];
            }
        }

        System.out.println("Largest Elem : " + largest);
    }

    public static  void smallestElem(int[] arr){
        int smallest = Integer.MAX_VALUE;

        for (int i=0; i<arr.length; i++){
            if (arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest Elem : " + smallest);
    }

    public static void sumElem(int[] arr){
        int sum = 0;
        for(int x:arr){
            sum += x;
        }
        System.out.println("Sum : " + sum);
    }

    public static void countEvenOdd(int[] arr){
        int oddCount = 0;
        int evenCount = 0;

        for (int i=0; i<arr.length; i++){
            if (arr[i]%2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }

        int[] ans = new int[] {oddCount, evenCount};
        System.out.println("Odd Count , Even Count" + Arrays.toString(ans));
    }

    public static void avg(int[] arr){
        int size = arr.length;
        int sum = 0;

        for (int x : arr){
            sum += x;
        }
        int avg = sum/size;

        System.out.println("Avg : " + avg);
    }

    public static void linearSearch(int[] arr, int target){
        boolean found = false;
        for (int i=0; i<arr.length ; i++){
            if (arr[i]==target){
                found = true;
                System.out.println("Target found at index : " + i);
                break;
            }
        }
        if (!found) System.out.println("Target not present in array");
    }

    public static void reverseArray1(int[] arr){
        //Using extra array
        int[] revArr = new int[arr.length];
        int i = arr.length-1;
        int j = 0;

        while (i >=0){
            revArr[j] = arr[i];
            j++;
            i--;
        }

        System.out.println("Reversed Array : " + Arrays.toString(revArr));
    }

    public static void reverseArray2(int[] arr){
        int j= arr.length-1;

        for (int i=0; i<j; i++){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            j--;
        }

        System.out.println("Reversed Array : " + Arrays.toString(arr));
    }

    public static void checkSorted(int[] arr){
        boolean isSorted = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]){
                isSorted = false;
                System.out.println("Not Sorted");
                break;
            }
        }
        if (isSorted) System.out.println("Sorted");
    }
}
