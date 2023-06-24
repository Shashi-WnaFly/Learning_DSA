package Learning_DSA.Arrays;

// Leetcode --> 1854. Maximum Population Year.
public class MaxPYear{
    public static int maximumPopulation(int[][] logs){
    int[] nLogs = new int[101];
    int i, j, max = 0, inYear = 1950;

        for(i=0; i<logs.length; i++){
            for(j=logs[i][0]; j<logs[i][1]; j++){
                nLogs[j-1950]++;
            }
        }
        for(j=0; j<101; j++){
            if(nLogs[j]>max){
                max = nLogs[j];
                inYear = j + 1950;
            }
        }
        return inYear;
    }
    public static void main(String[] args){
        int[][] logs = {{1950, 1961}, {1960, 1971}, {1970, 1981}};
        System.out.println(maximumPopulation(logs));
    }
}