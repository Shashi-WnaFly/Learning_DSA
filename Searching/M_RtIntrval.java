// Leetcode --> 436. Find Right Interval

class M_RtIntrval {
    public int[] findRightInterval(int[][] intervals) {
        int l = intervals.length;
        int[] res = new int[l];
        for(int i = 0; i < l; i++){
            int ch = intervals[i][1];
            boolean f = false;
            int cls = 1000001;
            for(int j = 0; j < l; j++){
                if(intervals[j][0] >= ch){
                    int stJ = intervals[j][0];
                    if(stJ-ch < cls){
                        res[i] = j;
                        f = true;
                        cls = stJ - ch;
                    }
                    else if(cls == 0) break;
                }
            }
            if(!f) res[i] = -1;
        }
        return res;
    }
}
