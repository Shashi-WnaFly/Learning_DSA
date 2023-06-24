package Learning_DSA.Arrays;

import java.util.Arrays;

public class ShuffleArr {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4, 7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(arr, n)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int i=0, k=0;
        while(i < nums.length){
            ans[i] = nums[k];
            ans[i+1] = nums[n];
            i += 2;
            k++;
            n++;
        }
        return ans;
    }
}
