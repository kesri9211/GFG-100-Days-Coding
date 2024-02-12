/*A function F is defined as follows F(n)= (1) +(2*3) + (4*5*6) ... upto n terms (look at the examples for better clarity). 
Given an integer n, determine the F(n).
Note: As the answer can be very large, return the answer modulo 109+7.

Example 1:

Input: n = 5
Output: 365527
Explanation: 
F(5) = 1 + 2*3 + 4*5*6 + 7*8*9*10 + 11*12*13*14*15 = 365527.*/
class Solution{
    static long sequence(int n){
        // code here
        int mod = 1000000007;
        int k=1;
        long sum=0;
        for(int i=1;i<=n;i++){
            int j=i;
            long prod=1;
            while(j-->0){
                prod=(prod*k++)% mod;
                
            }
            sum=(sum%mod+prod%mod);
                prod=1;
        }
        return sum%mod;
    }
}
