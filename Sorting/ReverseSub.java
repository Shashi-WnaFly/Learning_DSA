package Learning_DSA.Sorting;
// Leetcode --> 1460. Make Two Arrays Equal by Reversing Subarrays
import java.util.Arrays;
class Solution {
    // public static void sort(int[] arr){
    //     int n = arr.length, temp;
    //     for(int i = 0; i < n-1; i++){
    //         for(int j = i+1; j > 0; j--){
    //             if(arr[j] < arr[j-1]){
    //                 temp = arr[j];
    //                 arr[j] = arr[j-1];
    //                 arr[j-1] = temp;
    //             }
    //             else break;
    //         }
    //     }
    // }
    public boolean canBeEqual(int[] target, int[] arr) {
        // if(Arrays.equals(arr, target)) return true;
        // sort(arr);
        // sort(target);
        // return Arrays.equals(arr, target);

        // Second approach
        int MA= 1, n = target.length;
        int MT = 1, SA = 0, ST = 0;

        for(int i = 0; i < n; i++){
            MA *= arr[i];
            MT *= target[i];
            SA += arr[i];
            ST += target[i];
        }

        return ((MA == MT) && (SA == ST));
    }
}
