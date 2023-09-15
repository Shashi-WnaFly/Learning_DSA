package Learing_DSA.Sorting;
// Leetcode --> 16. 3Sum Closest it takes 628ms

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
    // second approach_________________ it takes 14ms
    public void sort(int[] ar){
        int n = ar.length;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j > 0; j--){
                if(ar[j-1] > ar[j]){
                    int t = ar[j-1];
                    ar[j-1] = ar[j];
                    ar[j] = t;
                }
                else break;
            }
        }
    }
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length, md = Integer.MAX_VALUE, res = 0, d;
        sort(nums);

        for(int i = 0; i < n-2; i++){
            int j = i + 1;
            int k = n-1;
            while(j < k){
                int v = nums[i]+nums[j]+nums[k];
                if(v == target) return v;
                else if(v < target) j++;
                else k--;
                d = Math.abs(v - target);
                if(d < md){
                    md = d;
                    res = v;
                }
            }
        }
        return res;
    }
}
