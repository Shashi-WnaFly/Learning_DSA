package DSA;

public class OdVMatrix {
    public static int oddValMat(int[][] indices, int m, int n) {
        int[][] mat = new int[m][n];
        int odd = 0;
        for (int i = 0; i < indices.length; i++) {
            int v;
            for (int j = 0; j < indices[i].length; j++) {
                v = indices[i][j];
                if (j == 0) {
                    for (int k = 0; k < n; k++) {
                        mat[v][k] += 1;
                    }
                } else {
                    for (int k = 0; k < m; k++) {
                        mat[k][v] += 1;
                    }
                }
            }
        }
        for (int l = 0; l < mat.length; l++) {
            for (int o = 0; o < mat[l].length; o++) {
                if (mat[l][o] % 2 != 0) odd++;
            }
        }
        return odd;
    }

    public static void main(String[] args) {
        int[][] indices = {{0, 1}, {1, 1}};
        int m = 2, n = 3;
        int k;
        k = oddValMat(indices, m, n);
        System.out.println(k);
    }
}
