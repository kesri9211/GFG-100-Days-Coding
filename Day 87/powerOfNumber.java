/*Given a number and its reverse. Find that number raised to the power of its own reverse.
Note: As answers can be very large, print the result modulo 109 + 7.

Example 1:

Input:
N = 2, R = 2
Output: 4
Explanation: The reverse of 2 is 2 and after raising power of 2 by 2 we get 4 which gives remainder as 4 when divided by 1000000007.
*/
class Solution
{
    
    long power(int N,int R)
    {
        long mod=1000000007;
        if(N==0){
            return 0;
        }
        if(R==0){
            return 1;
        }
        long c=R&1;
        if(c==0){
            long temp=power(N,R/2);
            return (temp%mod*temp%mod)%mod;
        }
        else{
            long temp=power(N,(R-1)/2);
            return (temp%mod*temp%mod*N%mod)%mod;// same but a little optimized
        }
    }

}
