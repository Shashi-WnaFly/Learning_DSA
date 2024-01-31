// GFG --> Prime number
class Prime{
    static int prime(int N, int i){
        if(i*i > N) return 1;
        else if(N%i == 0) return 0;
        return prime(N, i+1);
    }
    static int isPrime(int N){
        // code here
        if(N == 1) return 0;
        return prime(N, 2);
    }
}
