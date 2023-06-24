package Learning_DSA.Arrays;

import java.util.Scanner;

public class Primex {
    static boolean prime(int p) {
        int i;
        boolean prich;

        if (p <= 1) return false;
        for (i = 2; i * i <= p; i++) {
            if (p % i == 0) {
                prich = false;
                return prich;
            }
        }
        return i * i > p;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number to prime or not.");
        int i, count = 0;
        for (i = 1; i <= 1000; i++) {
            boolean check = prime(i);
            if (check) {
                System.out.print(i + ", ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
