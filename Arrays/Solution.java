package Learning_DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

// build an array from permutation.
class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] goa = new int[10];
        for (int i = 0; i < goa.length; i++) {
            goa[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(buildArray(goa)));
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
