package Learning_DSA.Searching;

// Leetcode --> 441. Arranging Coins
public class Staircase {
    public int arrangeCoins(int n) {
        int row = 1;
        while(row <= n) {
            n -= row;
            row++;
        }
        return row - 1;
    }

    public static void main(String[] args) {
        Staircase completeStair = new Staircase();
        System.out.println(completeStair.arrangeCoins(2147483647));
    }
}
