package Week_3_Revision;

public class Largest_Elem {
    public static void main(String[] args) {
        int[] arr = {2,5,4,3,1};

        largestElem(arr);
    }

    public static void largestElem(int[] arr){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("Largest : " + max);
    }
}
