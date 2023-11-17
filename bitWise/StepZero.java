// Leetcode --> 1342. Number of Steps to Reduce a Number to Zero
class StepZero {
    public int numberOfSteps(int num) {
        int step = 0, bit = 0;
        if(num == 0) return 0;
        while(num != 0){
            if((num&1) == 1) bit++;
            num >>= 1;
            step++;
        }
        return (step + bit - 1);
    }
}
