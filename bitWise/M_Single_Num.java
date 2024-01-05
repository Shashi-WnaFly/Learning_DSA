// 137. Single Number II
class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        int unique = 0;
        for(int i = 0; i < 32; ++i){
            int bits = 0;
            for(final int num : nums)
                bits += (num >> i) & 1;
            bits %= 3;
            unique |= bits << i;
        }
        return unique;
    }
}
