package Learning_DSA.Arrays;
// Leetcode --> 73. Set Matrix Zeroes

class M_SetZero {
    public void setZeroes(int[][] matrix) {

        List<Integer> li = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0; i < n; i++){
            boolean row = false;
            
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    li.add(j);
                    row = true;
                }
            }
            if(row){
                for(int k = 0; k < m; k++){
                    matrix[i][k] = 0;
                }
            }
        }
        for(int i = 0; i < li.size(); i++){
            for(int j = 0; j < n; j++){
                matrix[j][li.get(i)] = 0;
            }
        }
    }
}
