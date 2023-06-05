package DSA;

import java.util.*;
// Add To Array-Form Of Integer.
public class Array_Form {
    public static List<Integer> addToArrayForm(int[] num, int k) {

    }
    // My solution after trying much time.
//    public static int count(long l){
//        int c = 0;
//        while(l>0){
//            l/=10;
//            c++;
//        }
//        return c;
//    }
//    public static List<Integer> addToArrayForm(int[] num, int k){
//        List<Integer> sum = new ArrayList<>();
//
//        long res = 0;
//
//        for(int i=0; i<num.length; i++){
//            res = (res*10)+num[i];
//        }
//
//        res += k;
//        int l = count(res);
//        long[] narr = new long[l];
//
//        k=0;
//        while(res>0){
//            narr[k++] = res%10;
//            res /= 10;
//        }
//
//        int j = l-1;
//
//        for(int i = 0; i<l; i++){
//            sum.add(i, (int)narr[j--]);
//        }
//        System.gc();
//        return sum;
//    }

    public static void main(String[] args) {
//        int[] num = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
//        int k = 516;

        int[] num = {2, 1, 5};
        int k = 806;
        System.out.println(addToArrayForm(num, k));
        System.out.println(Long.MAX_VALUE);
        //[1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,5,7,9]
    }
}
