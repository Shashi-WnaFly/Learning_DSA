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
        int[] ans = new int[nums.length*2];
        int i = 0, res = 0;
        while(i<nums.length*2){
            if(i==nums.length) res = 0;
            ans[i] = nums[res];
            i++;
            res++;
        }
        return ans;
    }
}
