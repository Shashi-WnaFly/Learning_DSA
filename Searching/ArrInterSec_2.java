package Learning_DSA.Searching;
import java.util.Arrays;
// Leetcode   -->    350. Intersection of Two Arrays II

class ArrInterSec_2{
  public int[] intersect(int[] nums1, int[] nums2) {

        int len = 0, i = 0, j = 0, j_pos = 0;
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for(; i < nums2.length; i++){

            for(j = j_pos; j < nums1.length; j++){

                if(nums2[i] == nums1[j]){
                    nums2[len++] = nums2[i];
                    j_pos = j + 1;
                    break;
                }
            }
        }
        return Arrays.copyOfRange(nums2, 0, len);
    }
}
