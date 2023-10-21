// Leetcode --> 136. Single Number

class Unique {
    public int singleNumber(int[] nums) {
        int unique = 0, n = nums.length;
        for(int i = 0; i < n; i++){
            unique ^= nums[i];
        }
        return unique;
    }
}
