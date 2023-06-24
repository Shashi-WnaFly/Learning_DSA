package Learning_DSA.Arrays;

import java.util.Arrays;

public class Transpose {
    public static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int[][] mat = new int[matrix[0].length][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<matrix[0].length; j++){
                mat[j][i] = matrix[i][j];
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(Arrays.deepToString(transpose(mat)));

    }
}
