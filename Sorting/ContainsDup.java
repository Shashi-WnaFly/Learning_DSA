package Learning_DSA.Sorting;
// Leetcode --> 217. Contains Duplicate

class ContainsDup {
    public boolean containsDuplicate(int[] nums) {

        for(int i = 0; i < nums.length-1; i++){

            for(int j = i + 1; j > 0; j--){

                if(nums[j-1] > nums[j]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
                else if(nums[j-1] == nums[j]) return true;

                else{
                    break;
                }
            }
        }
        System.gc();
        return false;
    }
}
