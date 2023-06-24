package Learning_DSA.Arrays;

/*You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i and i + 1 for all (0 <= i < n). Return the highest altitude of a point.*/

import java.util.Arrays;

public class FHighAlt {
    public static int largestAltitude(int[] gain) {
        int[] Nalt = new int[gain.length + 1];
        Nalt[0] = 0;
        int max = 0, j = 0;
        for (int i = 1; i < Nalt.length; i++) {

            Nalt[i] = Nalt[i - 1] + gain[j];
            if (Nalt[i] > max) max = Nalt[i];
            j++;

        }
        System.out.println(Arrays.toString(Nalt));
        return max;
    }
    public static void main(String[] args){
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println("The highest altitude is : "+largestAltitude(gain));
    }
}
