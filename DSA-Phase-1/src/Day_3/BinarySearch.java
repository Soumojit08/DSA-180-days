package Day_3;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};

        System.out.println("Enter the target : ");
        int target = sc.nextInt();
        int ans = binarySearch(arr, target);
        if (ans == -1){
            System.out.println("Elem not found in array ");
        }
        System.out.println("Elem " + target + " found at index " + ans);

        int ansDesc = binarySearchDesc(arr2, target);
        if (ansDesc == -1){
            System.out.println("Elem not found in array ");
        }
        System.out.println("Elem " + target + " found at index " + ansDesc);
        binarySearchOrderAgonistic(arr2, target);
    }


    public static void binarySearchOrderAgonistic(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        if (arr[start] <= arr[end]){
            ans = binarySearch(arr, target);
        }
        else {
            ans = binarySearchDesc(arr, target);
        }

        if (ans == -1){
            System.out.println("Elem not found");
        }
        System.out.println("Elem " + target + " found at index " + ans);
    }

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                start = mid+1;
            } else if (arr[mid] > target){
                end = mid -1;
            }

        }
        return -1;
    }

    public static int binarySearchDesc(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                end = mid - 1;
            } else if (arr[mid] > target){
                start = mid + 1;
            }

        }
        return -1;
    }
}
