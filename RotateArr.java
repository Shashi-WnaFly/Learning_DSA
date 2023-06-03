package DSA;

import java.util.Arrays;

public class RotateArr {
    public static boolean findRotation(int[][] mat, int[][] target) {

        if(Arrays.deepEquals(mat, target)) return true;
        int l = mat.length;
        int c = l;
        boolean check = false;
        int[][] matrix = new int[l][l];
        int i, j;

            for (i = 0; i < l; i++) {
                c--;
                for (j = 0; j < l; j++) {
                    matrix[j][i] = mat[c][j];
                }
            }
            if (Arrays.deepEquals(matrix, target)) {
                check = true;
                return check;
            }
            c = l;

            for (i = 0; i < l; i++) {
                c--;
                for (j = 0; j < l; j++) {
                    mat[j][i] = matrix[c][j];
                }
            }

            if (Arrays.deepEquals(mat, target)) {
                check = true;
                return check;
            }

            c = l;
            for (i = 0; i < l; i++) {
                c--;
                for (j = 0; j < l; j++) {
                    matrix[j][i] = mat[c][j];
                }
            }
            if(Arrays.deepEquals(matrix, target)){
                check = true;
                return check;
            }
        return check;
    }

    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] target = {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};
        System.out.println(findRotation(mat, target));
    }
}
