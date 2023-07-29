package Learning_DSA.Sorting;
// Leetcode --> 268. Missing Number

class MisEle {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n-1; i++){

            for(int j = i + 1; j > 0; j--){

                if(nums[j-1] > nums[j]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
                else{
                    break;
                }
            }
        }
        if(n != nums[n-1]) return n;
        
        for(int i = 0; i < n; i++){
            if(i != nums[i]) return i;
        }
        return -1;
    }
}
