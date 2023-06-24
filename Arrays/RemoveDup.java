package Learning_DSA.Arrays;

// Leetcode 26. Remove Duplicates From Sorted Array.
public class RemoveDup {
    public static int removeDuplicates(int[] nums) {
        int k = 0, i=1;

        for(; i<nums.length; i++){
            if(nums[i] > nums[i-1]){
                k++;
                nums[k] = nums[i];
            }
        }
        k++;

        return k;
    }
    // this answer is not valid because i have to return total unique number and then they check till that number and return an array with unique elements
//        List<Integer> nodup = new ArrayList<>();
//        boolean check;
//        nodup.add(nums[0]);
//
//        for(int i = 0; i<nums.length; i++){
//            check = false;
//            for(int j = 0; j<nodup.size(); j++){
//
//                if(nodup.get(j) == nums[i]){
//                    check = true;
//                    break;
//                }
//
//            }
//            if(!check){
//                nodup.add(nums[i]);
//            }
//        }
//        return nodup;
//    }
    public static void main(String[] args){
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
//        System.out.println(Arrays.toString(removeDuplicates(arr)));
        System.out.println(removeDuplicates(arr));
    }
}
