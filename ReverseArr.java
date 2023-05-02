package DSA;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] Arrey = {13, 45, 422, 46, 788, 956};
        System.out.println(Arrays.toString(Arrey));
        swap(Arrey, 0, Arrey.length-1);
        System.out.println(Arrays.toString(Arrey));
    }

    private static void swap(int[] arrey, int a, int z) {
        for (a = 0; a < z/2; a++) {
            int temp = arrey[a];
            arrey[a] = arrey[z-a];
            arrey[z-a] = temp;
        }
    }
}
