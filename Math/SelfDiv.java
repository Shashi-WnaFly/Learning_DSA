// Leetcode --> 728. Self Dividing Numbers
class SelfDiv {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        while(left <= right){
            if(isDiv(left)) list.add(left);
            left++;
        }
        return list;
    }
    private static boolean isDiv(int l){
        boolean flag = true;
        int n = l;
        while(n > 0){
            int r = n%10;
            if(r == 0 || l % r != 0){
                flag = false;
                break;
            }
            n /= 10;
        }
        return flag;
    }
}