package Learning_DSA.Sorting;
// Leetcode --> 561. Array Partition
// It is my first approach to this question. which takes 664ms(that is 7.81%) and 41.77 (that is 100%)
class MinPairSum {
    public int arrayPairSum(int[] nums) {
        int temp;
            for(int i = 0; i < nums.length-1; i++){
                for(int j = i+1; j > 0; j--){
                    if(nums[j] < nums[j-1]){
                        temp = nums[j];
                        nums[j] = nums[j-1];
                        nums[j-1] = temp;
                    }
                    else break;
                }
            }

        int sum = 0;

        for(int i = 0; i < nums.length-1; i += 2){
                if(nums[i] <= nums[i+1]){
                    sum += nums[i];
            }
        }
        System.gc();
        return sum;
    }
}
