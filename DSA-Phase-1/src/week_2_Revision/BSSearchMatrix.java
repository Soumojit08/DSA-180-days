package week_2_Revision;

public class BSSearchMatrix {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40}, {15,25,35,45},{27,29,37,46},{32,33,39,50}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j] + "");
            }
            System.out.println();
        }

        int target = 29;
        boolean res = searchInMatrix(arr,target);
        System.out.println("Ans : " + res);
    }

    public static boolean searchInMatrix(int[][] matrix, int target){
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows*cols-1;

        while (left<=right){
            int mid = left+(right-left)/2;
            int midValue = matrix[mid/cols] [mid%cols];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
