package Learning_DSA.Arrays;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {

//   --> this is my learn approach from others. <--
        for(int i = digits.length-1; i>=0; i--){
            if(digits[i] != 9){
                digits[i]++;
                break;
            }
            else{
                digits[i] = 0;
            }
        }
        if(digits[0] == 0){
            int[] res = new int[digits.length+1];
            res[0] = 1;
            return res;
            }
        return digits;

//          *** this solution is my first approach. ***
//        int[] Plus1 = new int[digits.length];
//        int l = digits.length-1;
//        int carry = 1, sum = 0;
//
//        for(int i = 0; i<digits.length; i++){
//            sum = carry + digits[l];
//            Plus1[l--] = sum%10;
//            carry = sum/10;
//            sum /= 10;
//        }
//
//        if(carry != 0){
//            digits = new int[digits.length+1];
//            digits[0] = carry;
//            for(int i = 1; i<digits.length; i++){
//                digits[i] = Plus1[i-1];
//            }
//            return digits;
//        }
//        return Plus1;
    }

    public static void main(String[] args) {
        int[] arr = {9, 9, 9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}
