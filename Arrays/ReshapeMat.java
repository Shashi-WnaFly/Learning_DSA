package Learning_DSA.Arrays;

// Leetcode 566. Reshape the Matrix
import java.util.Arrays;

public class ReshapeMat {
    public static int[][] matrixReshape(int[][] mat, int r, int c){

        if(mat.length*mat[0].length == r*c){
// this is my second approach after watching the view bar of Leetcode solution.
            int rows = 0, cols = 0, i, j;
            int[][] mat1 = new int[r][c];

            for(i = 0; i<mat.length; i++){
                for(j = 0; j<mat[0].length; j++){
                    mat1[rows][cols] = mat[i][j];
                    cols++;
                    if(cols == c){
                        rows++;
                        cols = 0;
                    }
                }
            }
            return mat1;

// this approach is my first approach to solve this question.
//            int[] matrix = new int[r*c];
//            int[][] mat1 = new int[r][c];
//            int i, j, k = 0;
//
//            for(i = 0; i<mat.length; i++){
//
//                for(j = 0; j<mat[0].length; j++){
//
//                    matrix[k] = mat[i][j];
//                    k++;
//                }
//            }
//            k = 0;
//
//            for(i = 0; i<r; i++){
//
//                for(j = 0; j<c; j++){
//                    mat1[i][j] = matrix[k];
//                    k++;
//                }
//            }
//            return mat1;
        }

        return mat;
    }

    public static void main(String[] args){
        int[][] mat = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(matrixReshape(mat, 2, 4)));
    }
}
