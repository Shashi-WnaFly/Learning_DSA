package learning_DSA.Searching;]

// Leetcode --> 349. Intersection of Two Arrays.
class InterSecArr {
    public int[] intersection(int[] nums1, int[] nums2) {

        int[] temp = new int[1001];
        int cnt = 0;

        for(int i = 0; i < nums1.length; i++){
            temp[nums1[i]] = 1;  // value of nums1 array used as temp array index and initialize by 1.
        }

        for(int i = 0; i < nums2.length; i++){
            if(temp[nums2[i]] == 1){
                temp[nums2[i]] = 2; // value of nums2 array used as temp array index and initialize by 2.
                cnt++;
            }
        }
       
        int[] intersectionArr = new int[cnt];
        for(int i = 0, j = 0; i < temp.length && j < cnt; i++){
            if(temp[i] == 2){
                intersectionArr[j] = i; // adding of temp index if temp[i] match with value 2.
                j++;
            } 
        }
        return intersectionArr;
    }
}
