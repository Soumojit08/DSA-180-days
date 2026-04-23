package Week_3_Revision;

import java.util.*;

class Solution {
    public List spiralOrder(int[][] mat) {
        List res = new ArrayList<>();

        //initialize
        int n = mat.length, m = mat[0].length;
        int start_row = 0, start_col = 0;
        int end_row = n - 1, end_col = m - 1;

        while (start_row <= end_row && start_col <= end_col) {
            //top
            for (int j = start_col; j <= end_col; j++) {
                res.add(mat[start_row][j]);
            }
            //right
            for (int i = start_row + 1; i <= end_row; i++) {
                res.add(mat[i][end_col]);
            }
            // Bottom
            if (start_row < end_row) {
                for (int j = end_col - 1; j >= start_col; j--) {
                    res.add(mat[end_row][j]);
                }
            }
            // Left
            if (start_col < end_col) {
                for (int i = end_row - 1; i > start_row; i--) {
                    res.add(mat[i][start_col]);
                }
            }

            start_row++;
            start_col++;
            end_row--;
            end_col--;
        }

        return res;
    }
}


public class MatrixSpiral {
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        List ans = obj.spiralOrder(matrix);

        System.out.println(ans);
    }
}
