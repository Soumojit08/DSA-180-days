package Week_1_Revision;

public class LinearSearchpractice {
    public static void main(String[] args) {
        int[] arr = {1,5,6,3,6,9,2};
        int index = linearSearch(arr, 0);
        if (index==-1){
            System.out.println("Elem not found.");
        } else {
            System.out.println("Elem found at index : " + index);
        }
    }

    static int linearSearch(int[] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            if (target==arr[i]){
                return i;
            }
        }

        return -1;
    }
}
