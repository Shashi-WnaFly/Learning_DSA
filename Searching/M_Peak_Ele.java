// Leetcode --> 162. Find Peak Element
class M_Peak_Ele {
    public int findPeakElement(int[] nums) {
        int res = Integer.MIN_VALUE;
        int l = nums.length;
        int in = 0;
        if(l == 1) return 0;
        for(int i = 1; i < l-1; i++){
            if(nums[i-1] < nums[i] && nums[i+1] < nums[i] && nums[i] > res){
                res = nums[i];
                in = i;
            }
        }
        if(nums[0] > res && nums[l-1] < nums[0]) in = 0;
        else if(nums[l-1] > res) in = l-1;
        return in;
    }
}
