package Learning_DSA.Sorting;
// Leetcode --> 905. Sort Array By Parity

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int j = 0, k;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
              k = nums[i];
              nums[i] = nums[j];
              nums[j++] = k;
            }
        }
        return nums;
    }
}
