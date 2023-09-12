package Learning_DSA.Searching;
// Leetcode --> 540. Single Element in a Sorted Array

class M_SinElement {
    public int singleNonDuplicate(int[] nums) {
        int s = 0, e = nums.length-1, m = 0;
        if(nums.length == 1) return nums[0];
        else{
            if(nums[0] != nums[1]) return nums[0];
            else if(nums[e] != nums[e-1]) return nums[e];
        }
        while(s <= e){
            m = s + (e - s)/2;

            if(nums[m] != nums[m-1] && nums[m] != nums[m+1]) return nums[m];
            
            if(m%2 != 0){
                if(nums[m] == nums[m-1]) s = m + 1;
                else e = m - 1;
            }
            
            else{
                if(nums[m] == nums[m-1]) e = m-1;
                else s = m + 1;
            }
            
        }
        System.gc();
        return nums[m];
    }
}
