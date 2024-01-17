// GFG --> Find minimum and maximum element in an array

class MaxMin {
    static Pair getMinMax(long a[], long n)
    {
       int len = (int)n;
       long min = Long.MAX_VALUE;
       long max = 0;
       for(int i = 0; i < len; i++){
           if(a[i] < min) min = a[i];
           if(a[i] > max) max = a[i];
       }
       return new Pair(min, max);
    }
}
