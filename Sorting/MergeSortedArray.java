class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        boolean swap;
        int k = 0;
        for(int i = 0; i < nums1.length; i++){

            if(n == 0 && m > 0) break;
            if(n > 0 && m == 0){
                nums1[i] = nums2[i];
                n--;
            }
            if(i >= m && m != 0){
                nums1[i] = nums2[k++];
            }
            
        }

        for(int i = 0; i < nums1.length; i++){
                swap = false;
            for(int j = 1; j < nums1.length - i; j++){
                if(nums1[j] < nums1[j-1]){
                    int temp = nums1[j];
                    nums1[j] = nums1[j-1];
                    nums1[j-1] = temp;
                    swap = true;
                }
            }
                if(!swap) break;
        }
    }
}