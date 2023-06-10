package DSA;

import java.util.Arrays;

// Leetcode --> 1304. Find N Unique Integers Sum up to Zero
public class UniSmUpTo0 {
    public static int[] sumZero(int n) {
        int[] result = new int[n];
        int d = -(n/2);
        if(n%2 != 0){

            for(int i = 0; i<n; i++){
                result[i] = d;
                d++;
            }
        }
        else{
            for(int i = 0; i<n; i++){

                if(d==0) d++;
                result[i] = d;
                d++;
            }
        }
        return result;
    }
    public static void main(String[] args){
        int i = 7;
        System.out.println(Arrays.toString(sumZero(i)));
    }
}
