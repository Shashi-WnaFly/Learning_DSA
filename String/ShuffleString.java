package Learning_DSA.Sorting;
// Leetcode --> 1528. Shuffle String
class ShuffleString {
    public String restoreString(String s, int[] indices) {
      
        int n = indices.length;
        StringBuilder shuffle = new StringBuilder();
      
        for(int i = 0; i < n; i++){
          
            for(int j = 0; j < n; j++){
              
                if(indices[j] == i){
                    shuffle.append(s.charAt(j));
                    break;
                }
            }
        }
        return shuffle.toString();
    }
}
