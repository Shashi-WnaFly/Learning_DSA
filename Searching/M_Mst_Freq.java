// Leetcode --> 1838. Frequency of the Most Frequent Element
import java.util.Arrays;
class M_Mst_Freq {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int l = nums.length-1;
        int mFreq = 1;
        for(int j = l; j >= 0; --j){
            int freq = 1;
            int chnce = k;
            for(int i = j; i > 0 && chnce > 0; --i){
                int left = chnce + nums[i-1];
                chnce = left - nums[j];
                if(chnce >= 0) freq++;
            }
            if(freq > mFreq) mFreq = freq;

            else if(j < mFreq) break;
        }
        return mFreq;
    }
}
