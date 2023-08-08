package Learning_DSA.Sorting;
// Leetcode --> 977. Squares of a Sorted Array
// it takes 220ms and 45.3mb
class SqSortedArr {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            nums[i] = nums[i]*nums[i];
        }

        for(int i = 0; i < (n-1); i++){
            for(int j = i+1; j > 0; j--){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
                else break;
            }
        }
        return nums;
    }
// second solution 
    public int[] sortedSquares(int[] nums) {

        int n = nums.length, i = 0, k = n-1;
        int[] SqSortedArr = new int[n--];

        while(i <= n){
            SqSortedArr[k--] = (nums[i]*nums[i] > nums[n]*nums[n]) ? nums[i]*nums[i++] : nums[n]*nums[n--];
        }
        
        return SqSortedArr;
    }
    
}
