package Learning_DSA.Sorting;
// Leetcode --> 414. Third Maximum Number
// takes 40ms
class ThirdLar {
    public static void swap(int[] arr, int f, int l){
        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;
    }

    public int thirdMax(int[] nums) {

        for(int i = 0; i < nums.length-1; i++){

            for(int j = i+1; j > 0; j--){

                if(nums[j] > nums[j-1]) {
                    swap(nums, j, j-1);
                }
                else break;
            }
        }

        int cnt = 0, thd = 0;

        for(int i = 0; i < nums.length-1 && cnt < 3; i++){
            if(nums[i] != nums[i+1]){
                thd = nums[i];
                cnt++;
            }
            if(i == nums.length-2 && cnt < 3){
                thd = nums[i+1];
                cnt++;
            }
        }
        return (cnt < 3) ? nums[0] : thd;
    }
}
