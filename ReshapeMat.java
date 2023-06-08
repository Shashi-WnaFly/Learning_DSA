package DSA;

// Leetcode 566. Reshape the Matrix
import java.util.Arrays;

public class ReshapeMat {
    public static int[][] matrixReshape(int[][] mat, int r, int c){

        if(mat.length*mat[0].length == r*c){
            int[] matrix = new int[r*c];
            int[][] mat1 = new int[r][c];
            int i, j, k = 0;

            for(i = 0; i<mat.length; i++){

                for(j = 0; j<mat[0].length; j++){

                    matrix[k] = mat[i][j];
                    k++;
                }
            }
            k = 0;

            for(i = 0; i<r; i++){

                for(j = 0; j<c; j++){
                    mat1[i][j] = matrix[k];
                    k++;
                }
            }
            return mat1;
        }

        return mat;
    }

    public static void main(String[] args){
        int[][] mat = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(matrixReshape(mat, 1, 4)));
    }
}
