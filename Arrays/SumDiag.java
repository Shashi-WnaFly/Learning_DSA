package Learning_DSA.Arrays;

public class SumDiag {
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++)
            sum += mat[i][i];
        for (int i = 0; i < mat.length; i++) {
            if (i != mat[0].length - 1 - i)
                sum += mat[i][mat[0].length - 1 - i];
        }

        System.gc();
        return sum;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 5, 8},
                        {2, 3, 1},
                        {0, 6, 9}};
        int k;
        k = diagonalSum(mat);
        System.out.println(k);
    }
}
