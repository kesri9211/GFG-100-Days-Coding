/Given a positive integer n, find the nth fibonacci number. Since the answer can be very large, return the answer modulo 1000000007.

Note: for the reference of this question take first fibonacci number to be 1.*/
class Solution {
    static int nthFibonacci(int n){
        // code here
        int f=1;
        int s=1;
        int t=0;
        int mod=(int)1e9+7;
        if(n==1 || n==2) return f;
       
        else{
            for(int i=3;i<=n;i++){
                t=(f+s)%mod;
                f=s;
                s=t;
            }
        }
        return t;
    }
}
