package Learning_DSA.Sorting;
// Leetcode --> 1365. How Many Numbers Are Smaller Than the Current Number
class SmlerCurr {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int i, j, cnt, n = nums.length;
        int[] Snum = nums.clone();

        for(i = 0; i < n-1; i++){
            for(j = i+1; j > 0; j--){
                if(Snum[j] < Snum[j-1]){
                    int temp = Snum[j];
                    Snum[j] = Snum[j-1];
                    Snum[j-1] = temp;
                }
                else break;
            }
        }

        for(i = 0; i < n; i++){
             cnt = 0;

            for(j = 0; j < n; j++){
                if(nums[i] > Snum[j]) cnt++;
                
                else break;
            }
            
            nums[i] = cnt;
        }
        System.gc();
        return nums;
    }
}
