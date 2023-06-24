package Learning_DSA.Searching;

// Leetcode --> 374. Guess Number Higher or Lower
public class GuessGame {
    public static int guess(int guess){
        int pick = 9;
        if(guess < pick) return 1;
        else if(guess > pick) return -1;
        return 0;
    }
    public static int guessNumber(int n) {

        int start = 1, end = n, num, mid;

        while(start <= end){

            mid = start + (end - start)/2;
            num = guess(mid);

            if(num == -1){
                end = mid - 1;
            }

            else if(num == 1){
                start = mid + 1;
            }

            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int limit = 11;
        System.out.println(guessNumber(limit));
    }
}
