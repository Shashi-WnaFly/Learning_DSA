package Learning_DSA.Arrays;
// Leetcode --> 34. Find First and Last Position of Element in Sorted Array

class M_FirandLast {
    public int[] searchRange(int[] nums, int target) {
        int e = nums.length;
        if(e == 1 && nums[0] == target) return new int[] {0, 0};
        else if(e == 1 && nums[0] != target) return new int[] {-1, -1};

        int s = 0, mid = 0, l = e;

        boolean c = false;
        int[] res = new int[2];
        while(s != e){

            mid = s + (e - s)/2;

            if(nums[mid] == target){
                e = mid;
                res[0] = mid;
                c = true;
            }
            else if(nums[mid] > target) e = mid;

            else s = mid + 1;
        }
        if(c){
            for(; e < l; e++){
            
            if(nums[e] == target) res[1] = e;
            else break;
        }
        }
        return (c) ? res : new int[] {-1, -1};
    }
}
