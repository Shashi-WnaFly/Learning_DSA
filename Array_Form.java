package DSA;

import java.util.*;
// Add To Array-Form Of Integer.
public class Array_Form {
    public static int count(long l){
        int c = 0;
        while(l>0){
            l/=10;
            c++;
        }
        return c;
    }
    public static List<Integer> addToArrayForm(int[] num, int k){
        List<Integer> sum = new ArrayList<>();

        long res = 0;

        for(int i=0; i<num.length; i++){
            res = (res*10)+num[i];
        }

        res += k;
        int l = count(res);
        long[] narr = new long[l];

        k=0;
        while(res>0){
            narr[k] = res%10;
            res /= 10;
            k++;
        }

        int j = l-1;

        for(int i = 0; i<l; i++){
            sum.add(i, (int)narr[j]);
            j--;
        }

        System.gc();
        return sum;
    }

    public static void main(String[] args) {
        int[] num = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int k = 1;

        System.out.println(addToArrayForm(num, k));
        System.out.println(Long.MAX_VALUE);
    }
}
