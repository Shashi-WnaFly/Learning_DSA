package Learning_DSA.Searching;

// Leetcode --> 35. Search Insert Position.
public class SearchInsertPos {
    public static int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length-1, mid, res = 0;
        while(start <= end){
            mid = start + (end - start)/2;

            if(nums[mid] == target) return mid;
            else if(nums[mid] > target){
                end = mid - 1;
                res = mid;
            }
            else{
                start = mid + 1;
                res = mid + 1;
            }
        }
        System.gc();
        return res;
    }

    public static void main(String[] args) {
        int[] arr  = {1, 3, 5, 6};
        int target = 2;
        System.out.println(searchInsert(arr, target));
    }
}
