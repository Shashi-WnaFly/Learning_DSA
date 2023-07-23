package Learning_DSA.Searching;
// Leetcode --> 1346. Check If N and Its Double Exist
class DoubleExist {
    public boolean checkIfExist(int[] arr) {

        for(int i = 0; i < arr.length; i++){

            for(int j = i + 1; j < arr.length; j++){

                if(arr[i] == 2 * arr[j]) return true;
                else if((float)arr[i] == (float)arr[j]/2) return true;
            }

        }
        return false;
    }
}
