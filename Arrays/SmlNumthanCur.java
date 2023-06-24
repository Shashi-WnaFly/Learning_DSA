package Learning_DSA.Arrays;

import java.util.Arrays;

public class SmlNumthanCur {
    public static int[] smallerNumberThanCurrent(int[] Arr){
        int[] ans = new int[Arr.length];
        for(int i=0; i<Arr.length; i++){
            int cnt = 0;
            for(int num : Arr){
                cnt += (Arr[i] > num) ? 1 : 0;
            }
            ans[i] = cnt;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] res = {1, 5, 3, 8, 1, 2};
        System.out.println(Arrays.toString(smallerNumberThanCurrent(res)));
    }
}
