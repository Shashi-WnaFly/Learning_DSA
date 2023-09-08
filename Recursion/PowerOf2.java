package Learning_DSA.Recursion;
// Leetcode --> 231. Power of Two

class PowerOf2 {
    public boolean isPowerOfTwo(int n) {
        
        if(n == 1) return true;
        else if(n == 0) return false;

        if(n % 2 == 1) return false;
        n /= 2;
        return isPowerOfTwo(n);
    }
}
