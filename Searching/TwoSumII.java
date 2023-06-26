package Learning_DSA.Searching;

// Leetcode --> 167. Two Sum II - Input Array Is Sorted

import java.util.Arrays;

public class TwoSumII {
        public static int[] twoSum(int[] numbers, int target) {
            int start = 0, end = numbers.length-1;

            while(start < end){

                if(numbers[start] + numbers[end] == target) return new int[] {start+1, end+1};

                else if(numbers[start] + numbers[end] < target) start++;

                else {
                    end--;
                }
            }
            return null;
        }

    public static void main(String[] args) {
        int[] arr = {2,3,4};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }
}
