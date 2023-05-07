package DSA;

import java.util.ArrayList;
import java.util.List;
// There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
public class GreCanKid {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int i = 0, high = 0;
        ArrayList<Boolean> val = new ArrayList<>();

        while (i < candies.length) {
            if (candies[i] > high)
                high = candies[i];
            i++;
        }

        i = 0;

        while (i < candies.length) {

            if (candies[i] + extraCandies >= high) {
                val.add(true);
            } else {
                val.add(false);
            }
            i++;
        }
        return val;
    }

    public static void main(String[] args) {
        int[] kids = {9, 6, 11, 8, 7};
        List<Boolean> mylist = new ArrayList<>(kidsWithCandies(kids, 3));
        System.out.println(mylist);
    }
}
