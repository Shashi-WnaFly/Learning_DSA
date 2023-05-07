package DSA;

public class Gud_Pair {
    public static int numIdenticalPairs(int[] nums) {
    int i = 0, count = 0, k;
    while(i<nums.length){
        k = i;
        while(k+1<nums.length){
            if(nums[i] == nums[k+1])
                count++;
            k++;
        }
        i++;
    }
    return count;
}
    public static void main(String[] args) {
        int[] roll = {1, 2, 3, 1, 3, 1, 1};
        System.out.println(numIdenticalPairs(roll));
    }
}
