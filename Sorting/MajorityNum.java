package Learning_DSA.Sorting;
// Leetcode --> 169. Majority Element
class Solution {
    public static void swap(int[] arr, int s, int e){
        int temp = arr[e];
        arr[e] = arr[s];
        arr[s] = temp;
    }
    public static int index(int[] arr, int last){
        int max = Integer.MIN_VALUE;
        int index = -1;
        for(int i = 0; i <= last; i++){
            if(arr[i] >= max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
    public int majorityElement(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int last = nums.length - i - 1;
            int max_index = index(nums, last);
            swap(nums, max_index, last);
        }

        int major = 0;
        int n_index = 0, i = 0;

        while(i < nums.length){
            int cnt = 0;
            for(; n_index < nums.length; n_index++){
                if(nums[n_index] == nums[i]){
                    cnt++;
                }
                else{
                    break;
                }
            }

            if(cnt > nums.length/2){
                major = nums[i];
                break;
            }
            i = n_index;
        }
        return major;
    }
}
