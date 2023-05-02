package DSA;

import java.util.Arrays;

public class ArrSwap {
    static void swap(String[] music, int ind1, int ind2){
        String temp;
        temp = music[ind1];
        music[ind1] = music[ind2];
        music[ind2] = temp;
    }
    static void reverse(String[] arrey){
        int start = 0;
        int end = arrey.length-1;
        while(start < end){
            swap(arrey, start, end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        String[] dhun = {"Deepak", "Vikash", "Sanjeet", "Sunny"};
        reverse(dhun);
        System.out.println(Arrays.toString(dhun));
    }
}
