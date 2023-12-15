/*There are N points on the road, you can step ahead by 1 or 2 . If you start from a point 0,
  and can only move from point i to point i+1 after taking a step of length one, find the number of ways you can reach at point N.

Example 1:
Input: 
N = 4
Output: 
5
Explanation: Three ways to reach at 4th
point. They are {1, 1, 1, 1}, {1, 1, 2},
{1, 2, 1} {2, 1, 1}, {2, 2}.*/
class Solution
{
     public int nthPoint(int n)
    {
        // Code here
        if(n == 1 || n == 2) return n;
        
        int dp[] = new int[n+1];
        
        int mod = (int)Math.pow(10,9) + 7;
        
        dp[0] = 1; dp[1] = 1; dp[2] = 2;
        
        for(int i=3; i<=n; i++){
            dp[i] = (dp[i-1]%mod) + (dp[i-2]%mod);
        }
        
        return dp[n]%mod;
    }
}
