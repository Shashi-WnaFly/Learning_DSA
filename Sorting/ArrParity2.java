package Learning_DSA.Sorting;
// Leetcode --> 922. Sort Array By Parity II

class ArrParity2 {
    
    public int[] sortArrayByParityII(int[] nums) {

        int[] arr = new int[nums.length];

        int j = 0, k = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 != 0){
                arr[k] = nums[i];
                k += 2;
            }
            else{
                arr[j] = nums[i];
                j += 2;
            }
        }
        return arr;
    }
}
