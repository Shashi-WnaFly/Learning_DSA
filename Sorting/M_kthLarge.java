package.Learning_DSA.Sorting;
// Leetcode --> 215. Kth Largest Element in an Array

class M_kthLarge {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
