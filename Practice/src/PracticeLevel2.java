import java.util.Arrays;

public class PracticeLevel2 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 15};

        secondLargest(arr);
        secSmallest(arr);
        moveZeroEnd();
        moveZeroFront();
    }

    public static void secSmallest(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int secSmalleest = Integer.MAX_VALUE;

        for (int x : arr){
            if (x < smallest){
                secSmalleest = smallest;
                smallest = x;
            } else if (x < secSmalleest && x != smallest) {
                secSmalleest = x;
            }
        }

        System.out.println("Sec Smallest : " + secSmalleest);
    }

    public static void secondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int seclargest = Integer.MIN_VALUE;

        for (int x : arr){
            if (x > largest){
                seclargest = largest;
                largest = x;
            } else if (x > seclargest && x != largest) {
                seclargest = x;
            }
        }

        System.out.println("Sec Largest : " + seclargest);
    }

    public static void moveZeroEnd(){
        int [] arr = {0,1,0,3,12};

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroFront(){
        int [] arr = {0,1,0,3,12};

        int j = arr.length - 1;
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
