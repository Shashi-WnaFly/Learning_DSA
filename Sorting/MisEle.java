package Learning_DSA.Sorting;
// Leetcode --> 268. Missing Number

class MisEle {
    
//  *********     This is the first approach with insertion sort.     *********
/*    public int missingNumber(int[] nums) {   
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
    }    */
    
// **********    This is second approach using cyclic sort.    ***********
    public void sort(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
    public int missingNumber(int[] nums) {
        int n = nums.length, mis = n, i = 0;

        while(i < n){
            if(nums[i] < n && i != nums[i]){
                 sort(nums, nums[i], i);
            }
            else{
                i++;
            }
        }
        for(int i : nums){
            if(nums[i] != i) return i;
        }
        System.gc();
        return n;
    }
}
