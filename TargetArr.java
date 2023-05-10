package DSA;
import java.util.*;
public class TargetArr {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index){
        ArrayList<Integer> list = new ArrayList<>();
        int[] Target = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            list.add(index[i], nums[i]);
        }

        for(int i = 0; i<nums.length; i++){
            Target[i] = list.get(i);
        }
        return Target;
    }
}
