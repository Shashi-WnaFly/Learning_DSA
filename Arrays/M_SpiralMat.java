package Learning_DSA.Arrays;
// Leetcode --> 54. Spiral Matrix

class M_SpiralMat {
    public List<Integer> spiralOrder(int[][] matrix) {
        int i = 0, k = 0, j = 0, l = matrix.length*matrix[0].length, c = 1;
        List<Integer> arr = new ArrayList<>();
        while(c<=l){

            for(; j < matrix[i].length-i; j++){
                arr.add(matrix[i][j]);
                c++;
                if(c > l)break;
            }
            if(c > l)break;
            i++;
            j--;
            for(k = i; k < matrix.length-(i-1); k++){
                arr.add(matrix[k][j]);
                c++;
                if(c > l)break;
            }
            if(c > l)break;
            j--;
            k--;
            for(; j >= (i-1); j--){
                arr.add(matrix[k][j]);
                c++;
                if(c > l)break;
            }
            if(c > l)break;
            k--;
            j++;
            for(; k >= i; k--){
                arr.add(matrix[k][j]);
                c++;
                if(c > l)break;
            }
            if(c > l)break;
            k++;
            j++;
        }
        return arr;
    }
}
