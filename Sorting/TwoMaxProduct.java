package Learning_DSA.Sorting;
// Leetcode --> 1464. Maximum Product of Two Elements in an Array
class TwoMaxProduct {
    public static int index(int[] arr, int l){ // find max in a range.
        int max = 0, max_i = -1;

        for(int j = 0; j < l; j++){

            if(arr[j] > max){
                max = arr[j];
                max_i = j;
            }
        }
        return max_i;
    }

    public int maxProduct(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < 2; i++){
            int max = index(nums, nums.length-i);
            int temp = nums[max];
            nums[max] = nums[n-1-i];
            nums[n-1-i] = temp;
        }
        int res = (nums[n-1]-1) * (nums[n-2]-1);
        return res;
    }
}
