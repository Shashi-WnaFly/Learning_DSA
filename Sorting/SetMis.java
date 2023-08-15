package Learning_DSA.Sorting;
// Leetcode --> 645. Set Mismatch
class Solution {
    public static void swap(int[] arr, int f, int l){
        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;
    }

    public int[] findErrorNums(int[] nums) {
        int n = nums.length, i = 0;
        while(i < n){
            int correct = nums[i] - 1;     
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else i++;
        }
        for(i = 0; i < n; i++){
            if(nums[i] != i+1){
                return new int[] {nums[i], i+1};
            }
        }
        return null;
    }
}
