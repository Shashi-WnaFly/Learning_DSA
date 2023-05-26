package DSA;

import java.util.Arrays;
/*For example, flipping [1,1,0] horizontally results in [0,1,1].
        To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

        For example, inverting [0,1,1] results in [1,0,0].*/
public class FlipImage {
    public static int[][] flipAndInvertImage(int[][] image) {
        int l = image.length;
        int[][] flip = new int[l][l];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (image[i][j] == 1) {
                    image[i][j] = 0;
                } else image[i][j] = 1;
            }
            int m = 0;
            for (int k = l - 1; k >= 0; k--) {
                flip[i][m] = image[i][k];
                m++;
            }
            System.out.println();
        }

        return flip;
    }

    public static void main(String[] args) {
        int[][] flip = {{1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}};

        System.out.println(Arrays.deepToString(flipAndInvertImage(flip)));
    }
}
