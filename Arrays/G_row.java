package Learning_DSA.Arrays;

public class G_row {
    public static void main(String[] args) {
        int[][] acc = {
                {1,5,9},
                {7,3},
                {3,5,0,9}
        };
        System.out.println(maximumWealth(acc));
    }
    public static int maximumWealth(int[][] accounts) {
        int i, j, temp=0;
        for(i=0; i<accounts.length; i++){
            int sum = 0;
            for(j=0; j<accounts[i].length; j++){
                sum += accounts[i][j];
            }
            if(sum > temp) temp = sum;
        }
        return temp;
    }
}
