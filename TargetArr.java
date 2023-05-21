package DSA;
import java.util.*;
// Create Target Array in the Given Array.
public class TargetArr {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        int[] copy = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            int j = index[i];
            if(i > j){
                for(int k = 0; k<nums.length; k++) copy[k] = target[k];
                target[j] = nums[i];
                for(j=index[i]; j<nums.length-1; j++){
                    target[j+1] = copy[j];
                }
            }
            target[index[i]] = nums[i];
        }

//        for(int i = 0; i<nums.length; i++){
//            for(int j = i; j > index[i]; j--){
//                target[j] = target[j-1];
//            }
//            target[index[i]] = nums[i];
//        }
        return target;
    }
//    public static int[] createTargetArray(int[] nums, int[] index){
//        ArrayList<Integer> list = new ArrayList<>();
//        int[] Target = new int[nums.length];
//        for(int i = 0; i<nums.length; i++){
//            list.add(index[i], nums[i]);
//        }
//
//        for(int i = 0; i<nums.length; i++){
//            Target[i] = list.get(i);
//        }
//        return Target;
//    }
}
