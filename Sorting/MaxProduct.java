package Learning_DSA.Sorting;
// Leetcode --> 628. Maximum Product of Three Numbers
// it takes 584ms by selection sort.
class MaxProduct {
    public static int index(int[] arr, int last){
        int max = -1001, index = -1;
        for(int i = 0; i <= last; i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static int[] sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int ind = index(arr, arr.length-1-i);
            int temp = arr[ind];
            arr[ind] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }

    public int maximumProduct(int[] nums) {
        int max_product = 1;
        if(nums.length < 4) {
            for(int i = 0; i < 3; i++){
            max_product *= nums[nums.length-1-i];
            }
            return max_product;
        }

        sort(nums);
        int max2 = nums[0] * nums[1] * nums[nums.length-1];
        
        for(int i = 0; i < 3; i++){
            max_product *= nums[nums.length-1-i];
        }
        return (max2 > max_product) ? max2 : max_product;
    }
}
