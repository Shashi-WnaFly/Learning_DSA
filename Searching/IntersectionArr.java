package Learning_DSA.Searching;

import java.util.Arrays;

public class IntersectionArr {
    public static int[] intersection(int[] nums1, int[] nums2) {

        int[] intersectionarr = new int[nums1.length];
        int q = 0;

        for(int i = 0; i < nums1.length; i++) {
            for(int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]){
                    intersectionarr[q] = nums1[i];
                    q++;
                }
            }
        }
        return intersectionarr;
    }

    public static void main(String[] args) {
        int[] arrr = {4,9,5};
        int[] arrr2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(arrr, arrr2)));
    }
}
