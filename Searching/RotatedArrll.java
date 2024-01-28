// Leetcode --> 81. Search in Rotated Sorted Array II

class RotatedArrll {
    private boolean search2(int[] nums, int target, int s, int e){
        if(s > e) return false;
        int m = s + (e-s)/2;
        if(nums[m] == target) return true;
        if(nums[m] == nums[s] && nums[m] == nums[e]){
            s++;
            e--;
        }
        else if(nums[s] <= nums[m]){
            if(target >= nums[s] && target <= nums[m]) e = m-1;
            else s = m+1;
        }
        else if(target >= nums[m] && target <= nums[e]) s = m+1;
        else e = m-1;
        
        return search2(nums, target, s, e);
    }
    public boolean search(int[] nums, int target) {
        return search2(nums, target, 0, nums.length-1);
    }
}
