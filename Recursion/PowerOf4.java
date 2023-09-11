package Learning_DSA.Recursion;
// Leetcode --> 342. Power of Four

class PowerOf4 {
    public boolean isPowerOfFour(int n) {
        if(n == 1) return true;
        else if(n == 0 || n%4 >= 1) return false;
        return isPowerOfFour(n/4);
    }
}
