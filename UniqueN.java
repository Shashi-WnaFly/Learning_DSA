package DSA;

import java.util.ArrayList;
import java.util.List;
// Leetcode --> 1380. Lucky Numbers in a Matrix
public class UniqueN {
    public static List<Integer> luckyNumbers(int[][] ma) {

        List<Integer> lucky = new ArrayList<>();
        int c = 0, l, m = ma.length, n = ma[0].length;
        boolean check;

        for (int i = 0; i < m; i++) {
            check = true;
            l = ma[i][0];
            for (int j = 1; j < n; j++) {
                if (ma[i][j] < l) {
                    l = ma[i][j];
                    c = j;
                }
            }

            for (int k = 0; k < m; k++) {
                if (ma[k][c] > l) {
                    check = false;
                    break;
                }
            }
            if (check) lucky.add(ma[i][c]);
        }
        return lucky;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,10,4,2}, {9,3,8,7}, {15,16,17,12}};
        System.out.println(luckyNumbers(mat));
    }
}
