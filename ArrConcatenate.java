package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class ArrConcatenate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] tar = new int[4];
        for (int i = 0; i < tar.length; i++) {
            tar[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(getConcatenation(tar)));
    }
    public static int[] getConcatenation(int[] nums) {
        int n = 2*nums.length;
        int[] ans = new int[n];
        for(int i = 0; i<n; i++){
            if(i>=nums.length){
                ans[i] = nums[i-nums.length];
            }
            else{
            ans[i] = nums[i];
            }
        }
        return ans;
    }
}
