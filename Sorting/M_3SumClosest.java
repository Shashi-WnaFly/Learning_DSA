package Learing_DSA.Sorting;
// Leetcode --> 16. 3Sum Closest

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length, md = Integer.MAX_VALUE, res = 0, d;

        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    int v = nums[i]+nums[j]+nums[k];
                    if(v == target) return v;
                    else if(v > target) d = Math.abs(v - target);
                    else d = Math.abs(target - v);
                    if(d < md){
                        md = d;
                        res = v;
                    }
                }
            }
        }
        return res;
    }
}
