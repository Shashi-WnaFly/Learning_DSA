package Learning_DSA.Arrays;
// Leetcode --> 59. Spiral Matrix II

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] m = new int[n][n];
        int t = 0;
        int r = n-1;
        int l = 0;
        int b = n-1;
        int i = 1;
        int g = 0;
        int to = n*n;
        while(i <= to){
            for(; l <= r; l++){
                m[t][l] = i;
                if(i == to) return m;
                i++;
            }
            t++;
            l--;
            for(; t <= b; t++){
                m[t][b] = i;
                if(i == to) return m;
                i++;
            }
            t--;
            r--;
            for(; r >= g; r--){
                m[b][r] = i;
                if(i == to) return m;
                i++;
            }
            r++;
            b--;
            g++;
            for(; b >= g; b--){
                m[b][r] = i;
                if(i == to) return m;
                i++;
            }
            r++;
            l=g;
            r = n-g-1;
            b = n-g-1;
            t = g;
        }
        return m;
    }
}
