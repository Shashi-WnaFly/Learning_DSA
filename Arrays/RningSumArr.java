package Learning_DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RningSumArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        int[] nums = new int[4];
        for (i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
