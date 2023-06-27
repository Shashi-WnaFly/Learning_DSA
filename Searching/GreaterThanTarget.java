package Learning_DSA.Searching;

// Leetcode --> 744. Find Smallest Letter Greater Than Target

public class GreaterThanTarget {
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length-1, mid;
        char smallestChar = letters[0];

        if(smallestChar > target) return smallestChar;

        while(start <= end) {
            mid = start + (end - start)/2;

            if(letters[mid] <= target) start = mid + 1;

            else if(letters[mid] > target){
                end = mid - 1;
                smallestChar = letters[mid];
            }
            else {
                end = mid - 1;
            }
        }
        System.gc();
        return smallestChar;
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        System.out.println(nextGreatestLetter(arr, 'a'));
    }
}
