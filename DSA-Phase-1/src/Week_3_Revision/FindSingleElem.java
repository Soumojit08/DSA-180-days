package Week_3_Revision;

public class FindSingleElem {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 5, 5};

        findSingleElem(arr);
    }

    public static void findSingleElem(int[] arr){
        int ans;
        for (int i : arr){
            ans = i^(i+1);
            if (ans == 1){
                System.out.println("Single Elem : " + i);
                break;
            }
        }
    }
}
