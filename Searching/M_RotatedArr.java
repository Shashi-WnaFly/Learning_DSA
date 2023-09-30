package Learning_DSA.Searching;
// Leetcode --> 33. Search in Rotated Sorted Array

class M_RotatedArr {
    public int search(int[] nums, int target) {
        int e = nums.length-1;
        int n = e;
        int s = 0;

        while(s <= e){
            int m = s + (e-s)/2;
            if(nums[m] > nums[n]) s = m + 1;
            else e = m - 1;
        }
        
        int res1 = searchTarget(nums, target, 0, s-1);
        if(res1 > -1) return res1;

        return searchTarget(nums, target, s, n);
        
    }
    private int searchTarget(int[] nums, int t, int s, int e){
        while(s <= e){
            int m = s + (e - s)/2;
            
            if(nums[m] == t) return m;

            if(nums[m] > t) e = m - 1;
    
            else s = m + 1;
        }
        return -1;
    }
}
