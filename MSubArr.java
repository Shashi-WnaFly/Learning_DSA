package DSA;
// Leetcode --> 53. Maximum Subarray

public class MSubArr {
    int max = Integer.MIN_VALUE, i = 0, sum = 0, l = nums.length;
        for(; i<l; i++){

                sum += nums[i];
                max = Math.max(sum, max);

                if(sum<0) sum = 0;
            }
        return max;
    }

    public static void main(String[] args) {
        int[] net = {-2,1,-3,4,-1,2,1,-5,3};
        System.out.println(maxSubArray(net));
    }
}
