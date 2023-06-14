package DSA;

// Leetcode --> 53. Maximum Subarray
public class MSubArr {
    public static int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE, sum = 0, i = 0, l = nums.length;
        for (; i < l; i++) {


            sum += nums[i];
            max = Math.max(sum, max);

            if (0 > sum) sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] num = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(num));
    }
}