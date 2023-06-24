package Learning_DSA.Arrays;

import java.util.Scanner;
// print the prime number between the range of two numbers enter by the user.
public class PRime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range between you want to see prime number.");
        int f1 = in.nextInt();
        int l1 = in.nextInt();
        checkP(f1, l1);
    }

    static void checkP(int f1, int l1) {
        int d;
        for (; f1 <= l1; f1++) {
            boolean p = true;
            for (d = 2; d * d <= f1; d++) {
                if (f1 % d == 0) {
                    p = false;
                }
            }
            if (p && f1 > 1) {
                System.out.print(f1+" ");
            }
        }
    }
}
