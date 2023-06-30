package Learning_DSA.Searching;

// Leetcode --> 1539. Kth Missing Positive Number.

public class KthMisPosInt {
    public static int findKthPositive(int[] arr, int k) {

        int start = 0, end = arr.length, num = 1, missing = 0;

        while(missing != k)
        {

            if(start < end && num != arr[start]) missing++;

            else if(start >= end) missing++;

            else{
                start++;
            }

            num++;
        }
        return (num - 1);
    }

    public static void main(String[] args) {
        int[] arrow = {2, 3, 4, 7, 11};
        System.out.println(findKthPositive(arrow, 5));
    }
}
