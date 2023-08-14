package Learning_DSA.Sorting;
// Leetcode --> 448. Find All Numbers Disappeared in an Array
class DisapearEle {
    public static void swap(int[] arr, int f, int l){
        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> mis = new ArrayList<Integer>();
        int n = nums.length, i = 0;
        while(i < n){

            if(nums[i] == nums[nums[i] - 1]) i++;

            else if(nums[i] != i+1){
                swap(nums, nums[i]-1, i);
            }
        }

        for(i = 0; i < n; i++){
            if(nums[i] != i+1){
                mis.add(i+1);
            }
        }
        return mis;
    }
}
