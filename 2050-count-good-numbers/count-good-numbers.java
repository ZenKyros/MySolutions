class Solution {
    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;
        long MOD = 1000000007;
        long evenPart = pow(5,even);
        long oddPart = pow(4,odd);
        

        return (int) ((evenPart * oddPart ) % MOD);
        
    

    }
    public long pow(long a , long b){ 
        long MOD = 1000000007;
        if(b ==0) return 1;
        long half = pow(a , b/2);
        if( b %2 == 0) return (half * half )% MOD;
        return (half * half * a )% MOD;

    }
}