package Learning_DSA.Sorting;
// Leetcode --> 1051. Height Checker
class HeightChk {
    public int heightChecker(int[] heights) {
        int n = heights.length, cnt = 0;
        int[] expected = heights.clone();

        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j > 0; j--){
                if(heights[j] < heights[j-1]){
                    int temp = heights[j];
                    heights[j] = heights[j-1];
                    heights[j-1] = temp;
                }
                else break;
            }
        }

        for(int i = 0; i < n; i++){
            if(expected[i] != heights[i]) cnt++;
        }
        return cnt;
    }
}
