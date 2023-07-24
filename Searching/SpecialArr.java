package Learning_DSA.Searching;
// Leetcode --> 1608. Special Array With X Elements Greater Than or Equal X

class Solution {
    public int specialArray(int[] nums) {
        
        for(int i = nums.length; i > 0; i--){
            int cnt = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] >= i) cnt++;
            }
            if(i == cnt) return i;
        }
        return -1;
    }
}
