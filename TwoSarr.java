package DSA;

import java.util.Arrays;

public class TwoSarr {
    public static void main(String[] args) {
        int[] arr = {1, 12, 5, 8};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int i, j;
        for(i=0; i<nums.length-1; i++){

            for(j=1+i; j<nums.length; j++){

                if(nums[i]+ nums[j]==target){
                   return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
