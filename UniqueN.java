package DSA;

import java.util.ArrayList;
import java.util.List;

public class UniqueN {
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> lucky = new ArrayList<>();
        int c = 0;
        boolean check;
        for (int i = 0; i < matrix.length; i++) {
            check = true;
            lucky.add(0, matrix[i][0]);
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < lucky.get(0)) {
                    lucky.remove(0);
                    lucky.add(0, matrix[i][j]);
                    c = j;
                }
            }

            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][c] > lucky.get(0)) {
                    check = false;
                    lucky.remove(0);
                    break;
                }
            }

            if (check) {
                lucky.remove(0);
                lucky.add(matrix[i][c]);
            }
        }
        return lucky;
    }

    public static void main(String[] args) {
        int[][] mat = {{7, 8}, {1, 2}};
        System.out.println(luckyNumbers(mat));
    }
}
