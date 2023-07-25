package Learning_DSA.Searching;
// Leetcode --> 1351. Count Negative Numbers in a Sorted Matrix

class Solution {
    public int countNegatives(int[][] grid) {

        int rStart = 0, cEnd = grid[0].length-1, neg = 0;
        while(rStart < grid.length){

            if(grid[rStart][cEnd] < 0){
                neg += (grid.length - rStart);
                cEnd--;
            }
            
            if(cEnd < 0) break;

            if(grid[rStart][cEnd] >= 0){
                rStart++;
            }
        }
        return neg;
    }
}
