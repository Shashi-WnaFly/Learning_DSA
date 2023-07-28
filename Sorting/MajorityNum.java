package Learning_DSA.Sorting;
// Leetcode --> 169. Majority Element
class MajorityNum {
    // public static void swap(int[] arr, int s, int e){
    //     int temp = arr[e];
    //     arr[e] = arr[s];
    //     arr[s] = temp;
    // }
    // public static int index(int[] arr, int last){
    //     int max = Integer.MIN_VALUE;
    //     int index = -1;
    //     for(int i = 0; i <= last; i++){
    //         if(arr[i] >= max){
    //             max = arr[i];
    //             index = i;
    //         }
    //     }
    //     return index;
    // }
    // public int majorityElement(int[] nums) {
    //     for(int i = 0; i < nums.length; i++){
    //         int last = nums.length - i - 1;
    //         int max_index = index(nums, last);
    //         swap(nums, max_index, last);
    //     }

    //     int major = 0;
    //     int n_index = 0, i = 0;

    //     while(i < nums.length){
    //         int cnt = 0;
    //         for(; n_index < nums.length; n_index++){
    //             if(nums[n_index] == nums[i]){
    //                 cnt++;
    //             }
    //             else{
    //                 break;
    //             }
    //         }

    //         if(cnt > nums.length/2){
    //             major = nums[i];
    //             break;
    //         }
    //         i = n_index;
    //     }
    //     return major;
    // }
    public int majorityElement(int[] nums) {
        int n = nums.length, temp;

        for(int i = 0; i < n-1; i++){
            for(int j = i + 1; j > 0; j--){
                if(nums[j] < nums[j-1]){
                    temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
        System.gc();
        return nums[nums.length/2];
    }
}
