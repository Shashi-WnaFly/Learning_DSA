package Learning_DSA.Sorting;
import java.util.Arrays;
// Leetcode --> 1200. Minimum Absolute Difference

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);

        List<List<Integer>> nested = new ArrayList<>();
        int min_diff = 100000;

        for(int i = 0; i < arr.length-1; i++){
            int diff = arr[i+1] - arr[i];

            if(diff < min_diff){
                min_diff = diff;
                nested.clear();
            }
            if(min_diff == diff){
                nested.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
        return nested;
    }
}
