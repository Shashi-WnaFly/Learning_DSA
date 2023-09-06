package Learning_DSA.String;
Leetcode --> 1784. Check if Binary String Has at Most One Segment of Ones

Class Solution {
    
    public boolean checkOnesSegment(String s) {
        
        return (s.contains("01")) ? false : true;
    }
}
