package Learning_DSA.Recursion;
// Leetcode --> 704. Binary Search
class BinarySearch {
  public int search1(int[] nums, int target, int s, int e){

        if(s > e) return -1;

        int m = s + (e - s)/2;
        if(nums[m] == target) return m;
        if(nums[m] > target) return search1(nums, target, s, m - 1);

        return search1(nums, target, m+1, e);
  }
    public int search(int[] nums, int target) {
      return search1(nums, target, 0, nums.length-1);
    }
}
