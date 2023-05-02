package DSA;

import java.util.Arrays;

public class ArrSwap {
    static void swap(String[] music, int ind1, int ind2){
        String temp;
        temp = music[ind1];
        music[ind1] = music[ind2];
        music[ind2] = temp;

    }
    public static void main(String[] args) {
        String[] dhun = {"Deepak", "Vikash", "Sanjeet", "Sunny"};
        swap(dhun, 0, 3);
        System.out.println(Arrays.toString(dhun));
    }
}
